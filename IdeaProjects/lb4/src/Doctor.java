public class Doctor {
    private String day;
    private int visitorsCount;
    private String comment;
    private String lastName;
    private int experience;

    public Doctor(String day, int visitorsCount, String comment, String lastName, int experience) {
        this.day = day;
        this.visitorsCount = visitorsCount;
        this.comment = comment;
        this.lastName = lastName;
        this.experience = experience;
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

    public String getLastName() {
        return lastName;
    }

    public int getExperience() {
        return experience;
    }


}
