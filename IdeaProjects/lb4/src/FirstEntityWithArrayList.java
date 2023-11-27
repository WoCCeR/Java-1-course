import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FirstEntityWithArrayList extends AbstractFirstEntity {
    private List<Appointment> appointmentsList;

    public FirstEntityWithArrayList(List<Appointment> appointmentsList) {
        this.appointmentsList = new ArrayList<>(appointmentsList);
    }

    @Override
    public List<Appointment> searchByVisitorsCount(int targetVisitorsCount) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointmentsList) {
            if (appointment.getVisitorsCount() == targetVisitorsCount) {
                result.add(appointment);
            }
        }
        return result;
    }

    @Override
    public List<Appointment> getAppointments() {
        return new ArrayList<>(appointmentsList);
    }

    @Override
    public String toString() {
        return "FirstEntityWithArrayList: " + appointmentsList;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FirstEntityWithArrayList that = (FirstEntityWithArrayList) obj;
        return appointmentsList.equals(that.appointmentsList);
    }

    @Override
    public int hashCode() {
        return appointmentsList.hashCode();
    }


    public void bubbleSortByVisitorsCount() {
        appointmentsList.sort((a1, a2) -> Integer.compare(a1.getVisitorsCount(), a2.getVisitorsCount()));
    }

    @Override
    public void insertionSortByComment() {

        for (int i = 1; i < appointmentsList.size(); i++) {
            Appointment current = appointmentsList.get(i);
            int j = i - 1;
            while (j >= 0 && current.getComment().compareTo(appointmentsList.get(j).getComment()) < 0) {
                appointmentsList.set(j + 1, appointmentsList.get(j));
                j--;
            }
            appointmentsList.set(j + 1, current);
        }
    }

    @Override
    public List<Appointment> searchByCommentSubstring(String substring) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointmentsList) {
            if (appointment.getComment().contains(substring)) {
                result.add(appointment);
            }
        }
        return result;
    }
}
