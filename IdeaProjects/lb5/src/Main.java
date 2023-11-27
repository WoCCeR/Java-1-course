import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Appointment> appointmentsList = new ArrayList<>();
        appointmentsList.add(new Appointment("Понеділок", 20, "Прекрасний день"));
        appointmentsList.add(new Appointment("Вівторок", 15, "Неперевершено"));

        SortedSet<Appointment> appointmentsSet = new TreeSet<>(appointmentsList);

        testFirstEntity(new FirstEntityWithArrayList(appointmentsList));

        testFirstEntity(new FirstEntityWithSortedSet(appointmentsSet));

    }

    private static void testFirstEntity(AbstractFirstEntity entity) {
        System.out.println("Тестування " + entity.getClass().getSimpleName() + ":");
        System.out.println("Оригінал:");
        System.out.println(entity);

        entity.bubbleSortByVisitorsCount();
        System.out.println("Сортування за кількістю відвідувачів:");
        System.out.println(entity);

        entity.insertionSortByComment();
        System.out.println("Сортування за коментарями:");
        System.out.println(entity);

        List<Appointment> searchResult = entity.searchByVisitorsCount(15);
        System.out.println("Пошук за кількістю відвідувачів (15):");
        System.out.println(searchResult);

        searchResult = entity.searchByCommentSubstring("день");
        System.out.println("Пошук за підрядком коментаря ('день'):");
        System.out.println(searchResult);

        System.out.println("-------------");
    }







    private static double calculateAverageVisitors(List<Doctor> doctors, List<Appointment> appointments) {
        int totalVisitors = 0;
        int totalAppointments = 0;

        for (Doctor doctor : doctors) {
            totalVisitors += doctor.getVisitorsCount();
            totalAppointments++;
        }

        for (Appointment appointment : appointments) {
            totalVisitors += appointment.getVisitorsCount();
            totalAppointments++;
        }

        return (totalAppointments == 0) ? 0 : (double) totalVisitors / totalAppointments;
    }

    private static Appointment findMinVisitorsAppointment(List<Doctor> doctors, List<Appointment> appointments) {
        Appointment minAppointment = null;
        int minVisitors = Integer.MAX_VALUE;

        for (Doctor doctor : doctors) {
            if (doctor.getVisitorsCount() < minVisitors) {
                minAppointment = new Appointment(doctor.getDay(), doctor.getVisitorsCount(), doctor.getComment());
                minVisitors = doctor.getVisitorsCount();
            }
        }

        for (Appointment appointment : appointments) {
            if (appointment.getVisitorsCount() < minVisitors) {
                minAppointment = appointment;
                minVisitors = appointment.getVisitorsCount();
            }
        }

        return minAppointment;
    }

    private static String findLongestComment(List<Doctor> doctors, List<Appointment> appointments) {
        String longestComment = "";

        for (Doctor doctor : doctors) {
            if (doctor.getComment().length() > longestComment.length()) {
                longestComment = doctor.getComment();
            }
        }

        for (Appointment appointment : appointments) {
            if (appointment.getComment().length() > longestComment.length()) {
                longestComment = appointment.getComment();
            }
        }

        return longestComment;
    }

}
