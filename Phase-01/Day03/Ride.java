class Rides {
    int rideId;
    double distanceKm;
    int durationMinutes;
    double fare;

    Rides(int rideId, double distanceKm, int durationMinutes, double fare) {
        this.rideId = rideId;
        this.distanceKm = distanceKm;
        this.durationMinutes = durationMinutes;
        this.fare = fare;
    }

    void display() {
        System.out.println(
            "Ride ID: " + rideId +
            ", Distance: " + distanceKm + " km" +
            ", Duration: " + durationMinutes + " minutes" +
            ", Fare: $" + fare
        );
    }
}


public class Ride {
    public static void main(String[] args) {

        Rides[] rides = new Rides[5];

        rides[0] = new Rides(101, 12.5, 25, 15.0);
        rides[1] = new Rides(102, 8.0, 15, 10.0);
        rides[2] = new Rides(103, 20.0, 40, 25.0);
        rides[3] = new Rides(104, 5.5, 10, 7.5);
        rides[4] = new Rides(105, 15.0, 30, 18.0);

        double totalFare = 0;
        Rides longestRide = rides[0];

        for (int i = 0; i < rides.length; i++) {
            rides[i].display();
            totalFare += rides[i].fare;

            if (rides[i].distanceKm > longestRide.distanceKm) {
                longestRide = rides[i];
            }
        }

        double avarageFare = totalFare / rides.length;

        System.out.println("Avarage Fare: $" + avarageFare);

        System.out.println("\nLongest Ride:");
        longestRide.display();

        System.out.println("\nCost per km for each ride:"); 
        for (int i = 0; i < rides.length; i++) {
            double costPerKm = rides[i].fare / rides[i].distanceKm;
            System.out.println("Ride ID " + rides[i].rideId + ": $" + costPerKm + " per km");
        };
      }
}