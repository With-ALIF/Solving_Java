class Reading {
    String room;
    double value;

    public Reading(String room, double value) {
        this.room = room;
        this.value = value;
    }
}

public class main {
    public static void main(String[] agrs) {

        Reading[] readings = {
            new Reading("Room A", 25.5),
            new Reading("Room B", 22.0),
            new Reading("Room A", 26.0),
            new Reading("Room B", 21.5),
            new Reading("Room A", 24.0),
            new Reading("Room A", 23.0),
            new Reading("Room B", 23.5)
        };

        double sum = 0;
        int count = 0;

        for (Reading reading : readings) {
            if (reading.room.equals("Room A")) {
                sum += reading.value;
                count++;
            }
        }

        double avg = 0;
        if (count > 0) {
            avg = sum / count;
        }

        System.out.println("\nAverage temperature in Room A:  " + avg);
    }
}