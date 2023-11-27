import java.util.Objects;
public class Appointment implements Comparable<Appointment> {
    private String day;
    private int visitorsCount;
    private String comment;

    public Appointment(String day, int visitorsCount, String comment) {
        this.day = day;
        this.visitorsCount = visitorsCount;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "День: " + day + ", Кількість відвідувачів: " + visitorsCount + ", Коментар: " + comment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Appointment that = (Appointment) obj;
        return visitorsCount == that.visitorsCount && Objects.equals(day, that.day) && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, visitorsCount, comment);
    }


    @Override
    public int compareTo(Appointment other) {
        return comment.compareTo(other.getComment());
    }

    public String getDay() {
        return day;
    }

    public int getVisitorsCount() {
        return visitorsCount;
    }

    public String getComment() {
        return comment;
    }

}