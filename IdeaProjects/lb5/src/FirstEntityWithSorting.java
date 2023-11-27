import java.util.Arrays;
import java.util.Comparator;

public class FirstEntityWithSorting extends FirstEntityWithArray {
    protected FirstEntityWithSorting(Appointment[] appointments) {
        super(appointments);
    }

    @Override
    public void bubbleSortByVisitorsCount() {
        super.bubbleSortByVisitorsCount();
    }

    @Override
    public void insertionSortByComment() {
        Arrays.sort(super.appointments, Comparator.comparing(Appointment::getComment));
    }
}
