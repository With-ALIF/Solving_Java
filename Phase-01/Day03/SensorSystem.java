class SensorReading {

    int sensorId;
    String location;
    String type;
    double value;
    String unit;
    String timestamp;

    SensorReading(int sensorId, String location, String type, double value, String unit, String timestamp) {
        this.sensorId = sensorId;
        this.location = location;
        this.type = type;
        this.value = value;
        this.unit = unit;
        this.timestamp = timestamp;
    }

    void display() {
        System.out.printf(
            "%-6d %-15s %-12s %-10.2f %-10s %-20s%n", sensorId, location, type, value, unit, timestamp
        );
    }
}

public class SensorSystem {
    public static void main(String[] args) {
        SensorReading[] readings = {

            new SensorReading(1001, "Thakurgaon", "Temperature", 32.5, "Celsius", "2025-06-01 10:00"),
            new SensorReading(1002, "Rangpur", "Humidity", 60.0, "Percent", "2025-06-01 10:05"),
            new SensorReading(1003, "Thakurgaon", "Pressure", 1012.3, "hPa  ", "2025-06-01 10:10"),
            new SensorReading(1004, "Lalmonirhat", "Temperature", 35.2, "Celsius", "2025-06-01 11:00"),
            new SensorReading(1005, "Rangpur", "Humidity", 55.5, "Percent", "2025-06-01 11:05"),
            new SensorReading(1006, "Lalmonirhat", "Temperature", 30.8, "Celsius", "2025-06-01 11:10"),
            new SensorReading(1007, "Dhaka", "Temperature", 33.8, "Celsius", "2025-06-01 12:00"),
            new SensorReading(1008, "Dhaka", "Humidity", 65.2, "Percent", "2025-06-01 12:05"),
            new SensorReading(1009, "Rangpur", "Pressure", 1010.5, "hPa", "2025-06-01 12:10"),
            new SensorReading(1010, "Thakurgaon", "Temperature", 29.4, "Celsius", "2025-06-01 13:00"),
            new SensorReading(1011, "Lalmonirhat", "Humidity", 58.7, "Percent", "2025-06-01 13:05"),
            new SensorReading(1012, "Dhaka", "Pressure", 1013.1, "hPa", "2025-06-01 13:10"),
            new SensorReading(1013, "Rangpur", "Temperature", 31.6, "Celsius", "2025-06-01 14:00"),
            new SensorReading(1014, "Thakurgaon", "Humidity", 62.3, "Percent", "2025-06-01 14:05"),
            new SensorReading(1015, "Lalmonirhat", "Pressure", 1009.8, "hPa", "2025-06-01 14:10")

        };

        double globalTotal = 0;
        SensorReading highest = readings[0];

        double tempTotal = 0, humTotal = 0, presTotal = 0;
        int tempCount = 0, humCount = 0, presCount = 0;

        double dhakaTotal = 0, rangpurTotal = 0, thakurgaonTotal = 0, lalmonirhatTotal = 0;
        int dhakaCount = 0, rangpurCount = 0, thakurgaonCount = 0, lalmonirhatCount = 0;

        System.out.println("All Sensor Readings:\n");
        System.out.printf( "%-6s %-15s %-12s %-10s %-10s %-20s%n", "ID", "Location", "Type", "Value", "Unit", "Time"  );
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < readings.length; i++) {

            readings[i].display();

            globalTotal += readings[i].value;

            if (readings[i].value > highest.value) {
                highest = readings[i];
            }

            if (readings[i].type.equals("Temperature")) {
                tempTotal += readings[i].value;
                tempCount++;
            } 
            else if (readings[i].type.equals("Humidity")) {
                humTotal += readings[i].value;
                humCount++;
            } 
            else if (readings[i].type.equals("Pressure")) {
                presTotal += readings[i].value;
                presCount++;
            }

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
            else if (readings[i].location.equals("Lalmonirhat")) {
                lalmonirhatTotal += readings[i].value;
                lalmonirhatCount++;
            }
        }

        System.out.printf("\nGlobal Average: %.2f\n", (globalTotal / readings.length));

        System.out.println("\nHighest Reading:");
        highest.display();

        System.out.println("\nType Specific Averages:");

        if (tempCount > 0)
            System.out.printf("Temperature Avg: %.2f Celsius\n", (tempTotal / tempCount));

        if (humCount > 0)
            System.out.printf("Humidity Avg: %.2f Percent\n", (humTotal / humCount));

        if (presCount > 0)
            System.out.printf("Pressure Avg: %.2f hPa\n", (presTotal / presCount));

        System.out.println("\nLocation Specific Averages:");

        if (dhakaCount > 0)
            System.out.printf("Dhaka Avg: %.2f\n", (dhakaTotal / dhakaCount));

        if (rangpurCount > 0)
            System.out.printf("Rangpur Avg: %.2f\n", (rangpurTotal / rangpurCount));

        if (thakurgaonCount > 0)
            System.out.printf("Thakurgaon Avg: %.2f\n", (thakurgaonTotal / thakurgaonCount));

        if (lalmonirhatCount > 0)
            System.out.printf("Lalmonirhat Avg: %.2f\n", (lalmonirhatTotal / lalmonirhatCount));
    }
}