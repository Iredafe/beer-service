package dafe.springframework.beerservice.Grokking;

import java.util.Arrays;

public class ConflictingAppointment {

    static class Interval{
        int start;
        int end;
        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    private static boolean canAttendAllAppointments(Interval [] appointments){
        Arrays.sort(appointments, (a, b)->Integer.compare(a.start , b.start));
        if(appointments.length==1) return true;
        int start = appointments[0].start;
        int end = appointments[0].end;
        for(Interval appointment : appointments){
            if(appointment.start != start && appointment.start <= end){
                return false;
            }
            start=appointment.start;
            end=appointment.end;
        }
        return true;
    }

    public static void main(String[] args) {
        Interval[] intervals = { new Interval(1, 4), new Interval(2, 5),
                new Interval(7, 9) };
        boolean result = canAttendAllAppointments(intervals);
        System.out.println("Can attend all appointments: " + result);

        Interval[] intervals1 = { new Interval(6, 7), new Interval(2, 4),
                new Interval(8, 12) };
        result = canAttendAllAppointments(intervals1);
        System.out.println("Can attend all appointments: " + result);

        Interval[] intervals2 = { new Interval(4, 5), new Interval(2, 3),
                new Interval(3, 6) };
        result = canAttendAllAppointments(intervals2);
        System.out.println("Can attend all appointments: " + result);
    }
}
