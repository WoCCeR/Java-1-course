import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class FileEntity {
    protected List<String> data;

    public abstract void readFromFile(String fileName) throws IOException;

    public abstract void writeToFile(String fileName) throws IOException;

    public void displayResults() {
        System.out.println("Data:");
        for (String entry : data) {
            System.out.println(entry);
        }
    }
}

class TextFileEntity extends FileEntity {
    public TextFileEntity() {
        data = new ArrayList<>();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        }
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        // Сортування перед записом
        Collections.sort(data);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String entry : data) {
                writer.write(entry + "\n");
            }
        }
    }
}



class BinaryFileEntity extends FileEntity {
    public BinaryFileEntity() {
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            try {
                data = (List<String>) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        Collections.sort(data);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
        }
    }
}

public class FileInteractionDemo {
    public static void main(String[] args) {
        TextFileEntity textFileEntity = new TextFileEntity();
        try {
            textFileEntity.readFromFile("text_input.txt");
            textFileEntity.displayResults();
            textFileEntity.writeToFile("text_output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BinaryFileEntity binaryFileEntity = new BinaryFileEntity();
        try {
            binaryFileEntity.readFromFile("binary_input.dat");
            binaryFileEntity.displayResults();
            binaryFileEntity.writeToFile("binary_output.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
