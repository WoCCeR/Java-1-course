import java.util.ArrayList;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        TwoDimensionalArrayOfPoints twoDPoints = new TwoDimensionalArrayOfPoints(4);
//        twoDPoints.test();
//
//        OneDimensionalArrayOfPoints oneDPoints = new OneDimensionalArrayOfPoints(4);
//        oneDPoints.test();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Appointment appointment1 = new Appointment("Понеділок", 10, "Гарний день");
        Appointment appointment2 = new Appointment("Вівторок", 5, "Веселі клієнти");

        Appointment[] appointmentsArray = {appointment1, appointment2};

        FirstEntityWithSorting entity = new FirstEntityWithSorting(appointmentsArray);

        // Тестування сортування за коментарем
        System.out.println("Перед сортуванням:");
        System.out.println(entity);
        entity.insertionSortByComment();
        System.out.println("Після сортування за коментарем:");
        System.out.println(entity);
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
