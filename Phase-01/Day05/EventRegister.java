class Item {
    int eventID;
    int studentId;
    String StudentName;
    String registeredTime;
    boolean checkedIn;

    Item(int eventID, int studentId, String StudentName, String registeredTime, boolean checkedIn) {
        this.eventID = eventID;
        this.studentId = studentId;
        this.StudentName = StudentName;
        this.registeredTime = registeredTime;
        this.checkedIn = checkedIn;
    }

    void display() {
        System.out.println( "Event ID: " + eventID +
            ", Student ID: " + studentId + 
            ", Student Name: " + StudentName +
            ", Time: " + registeredTime +
            ", Checked In: " + checkedIn
        );
    }
}

public class EventRegister{
    public static void main(String[] args) {
        Item[] items = new Item[4]; 

        items[0] = new Item(101, 1, "Alif", "10:00 AM", false);
        items[1] = new Item(102, 2, "Anne", "10:15 AM", true);
        items[2] = new Item(103, 3,"Rafi", "10:30 AM", true);
        items[3] = new Item(104, 4, "Khalid", "10:45 AM", false);

        System.out.println("All Event Registrations: ");
        for (Item item : items) {
            item.display();
        }

        int checkedInCount = 0;
        System.out.println("\nChecked In Students: ");
        
        for (Item item : items) {
            if (item.checkedIn) {
                item.display();
                checkedInCount++;
            }
        }

        System.out.println("Total Checked In Students: " + checkedInCount);

    }
}