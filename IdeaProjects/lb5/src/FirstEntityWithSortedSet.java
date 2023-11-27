import java.util.*;

public class FirstEntityWithSortedSet extends AbstractFirstEntity {
    private SortedSet<Appointment> appointmentsSet;

    public FirstEntityWithSortedSet(SortedSet<Appointment> appointmentsSet) {
        this.appointmentsSet = new TreeSet<>(appointmentsSet);
    }

    @Override
    public List<Appointment> getAppointments() {
        return new ArrayList<>(appointmentsSet);
    }

    @Override
    public String toString() {
        return "FirstEntityWithSortedSet: " + appointmentsSet;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FirstEntityWithSortedSet that = (FirstEntityWithSortedSet) obj;
        return appointmentsSet.equals(that.appointmentsSet);
    }

    @Override
    public int hashCode() {
        return appointmentsSet.hashCode();
    }

    @Override
    public void insertionSortByComment() {
        SortedSet<Appointment> sortedSet = new TreeSet<>(Comparator.comparing(Appointment::getComment));
        sortedSet.addAll(appointmentsSet);
        appointmentsSet = sortedSet;
    }

    @Override
    public List<Appointment> searchByVisitorsCount(int targetVisitorsCount) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointmentsSet) {
            if (appointment.getVisitorsCount() == targetVisitorsCount) {
                result.add(appointment);
            }
        }
        return result;
    }

    @Override
    public List<Appointment> searchByCommentSubstring(String substring) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointmentsSet) {
            if (appointment.getComment().contains(substring)) {
                result.add(appointment);
            }
        }
        return result;
    }

    public void bubbleSortByVisitorsCount() {
        // Сортування за кількістю відвідувачів не потрібне у TreeSet, вона сама сортується при вставці
    }

}
