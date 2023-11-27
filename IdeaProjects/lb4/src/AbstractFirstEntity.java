import java.util.List;

public abstract class AbstractFirstEntity {
    public abstract List<Appointment> getAppointments();

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();

    public abstract List<Appointment> searchByVisitorsCount(int targetVisitorsCount);

    public abstract List<Appointment> searchByCommentSubstring(String substring);

    public abstract void bubbleSortByVisitorsCount();

    public abstract void insertionSortByComment();
}