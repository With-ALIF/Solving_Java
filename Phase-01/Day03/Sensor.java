class Main {
    int sensorId;
    String location;
    double value;
    String unit;
    String timestamp;

    Main(int sensorId, String locattion, double value, String unit, String timestamp) {
        this.sensorId = sensorId;
        this.location = locattion;
        this.value = value;
        this.unit = unit;
        this.timestamp = timestamp;
    }

    void display() {
        System.out.println(
            "Sensor ID: " + sensorId +
            ", Location: " + location +
            ", Value: " + value + " " + unit +
            ", Timestamp: " + timestamp
        );
    }
}

public class Sensor {
    public static void main(String[] args) {

        Main[] readings = new Main[3];

        readings[0] = new Main(201, "Dhaka", 23.5, "Celsius", "2025-06-01 10:00:00");
        readings[1] = new Main(202, "Rangpur", 45.0, "Percent", "2025-06-01 10:05:00");
        readings[2] = new Main(203, "Thakurgaon", 1013.25, "hPa", "2025-06-01 10:10:00");

        Main highest = readings[0];

        System.out.println("All Sensor Readings: ");
        for (int i = 0; i < readings.length; i++) {
            readings[i].display();

            if(readings[i].value > highest.value) {
                highest = readings[i];
            }
        }

        System.out.println("\nHighest Reading: ");
        highest.display();

        double dhakaTotal = 0,  rangpurTotal = 0, thakurgaonTotal = 0;
        int dhakaCount = 0, rangpurCount = 0, thakurgaonCount = 0;

        for (int i = 0; i < readings.length; i++) {
            if (readings[i].location.equals("Dhaka")) {
                dhakaTotal += readings[i].value;
                dhakaCount++;
            }
            else if (readings[i].location.equals("Rangpur")) {
                rangpurTotal += readings[i].value;
                rangpurCount++;
            }
            else if (readings[i].location.equals("Thakurgaon")) {
                thakurgaonTotal += readings[i].value;
                thakurgaonCount++;
            }
        }

        System.out.println("\nAverage Reading per Location:");
            if (dhakaCount > 0)
                System.out.println("Dhaka: " + (dhakaTotal / dhakaCount));
            if (rangpurCount > 0)
                System.out.println("Rangpur: " + (rangpurTotal / rangpurCount));
            if (thakurgaonCount > 0)
                System.out.println("Thakurgaon: " + (thakurgaonTotal / thakurgaonCount));
    }
}   
