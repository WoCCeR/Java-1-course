import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class FirstEntityWithArray extends AbstractFirstEntity {
    protected Appointment[] appointments;

    public FirstEntityWithArray(Appointment[] appointments) {
        this.appointments = appointments;
    }

    @Override
    public List<Appointment> getAppointments() {
        return Arrays.asList(appointments);
    }

    @Override
    public String toString() {
        return "FirstEntityWithArray: " + Arrays.toString(appointments);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FirstEntityWithArray that = (FirstEntityWithArray) obj;
        return Arrays.equals(appointments, that.appointments);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(appointments);
    }

    @Override
    public List<Appointment> searchByVisitorsCount(int targetVisitorsCount) {
        return null;
    }

    @Override
    public List<Appointment> searchByCommentSubstring(String substring) {
        return null;
    }

    @Override
    public void bubbleSortByVisitorsCount() {
    }

    @Override
    public void insertionSortByComment() {
    }
}
