import java.util.Scanner;

public class Lab1_bool {

    public static int ConvertToInt(boolean x)
    {
        if (x){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static boolean ConvertToBoolean(int q){

        return q != 0;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        boolean x = scanner.nextBoolean();
        System.out.println( ConvertToInt(x));
        System.out.println("Enter a value for q: ");
        int q = scanner.nextInt();
        System.out.println(ConvertToBoolean(q));

    }
}