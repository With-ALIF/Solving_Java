class AppSessions {
    int sessionId;
    int userId;
    int startTime;
    int endTime;
    double dataUsedMB;

    AppSessions(int sessionId, int userId, int startTime, int endTime, double dataUsedMB) {
        this.sessionId = sessionId;
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dataUsedMB = dataUsedMB;
    }

    int getDuration() {
        return endTime - startTime;
    }

    void display() {
        System.out.println(
            "Session ID: " + sessionId +
            ", User ID: " + userId +
            ", Duration: " + getDuration() + " mins" +
            ", Data Used: " + dataUsedMB + " MB"
        );
    }
}

public class Appsession {
    public static void main(String[] args) {

        AppSessions [] sessions = new AppSessions[4];

        sessions[0] = new AppSessions(101, 1, 0, 30, 120);
        sessions[1] = new AppSessions(102, 2, 10, 55, 180);
        sessions[2] = new AppSessions(103, 3, 15, 75, 90);
        sessions[3] = new AppSessions(104, 4, 0, 15, 60);

        AppSessions longestSession = sessions[0];
        double dataThreshold = 150;

        System.out.println("All Sessions:");
        for (int i = 0; i < sessions.length; i++) {
            sessions[i].display();

            if (sessions[i].getDuration() > longestSession.getDuration()) {
                longestSession = sessions[i];
            }
        }

        System.out.println("\nLongest Session:");
        longestSession.display();

        System.out.println("\nSessions exceeding data threshold (" + dataThreshold + " MB):\n");
        for (int i = 0; i < sessions.length; i++) {
            if (sessions[i].dataUsedMB > dataThreshold) {
                sessions[i].display();
            }
        }
    }
}