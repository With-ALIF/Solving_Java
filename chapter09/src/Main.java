public class Main {

    static class PasswordPolicy {
        int minLength;
        int maxLength;
        String special;

        PasswordPolicy(int minLength, int maxLength, String special) {
            this.minLength = minLength;
            this.maxLength = maxLength;
            this.special = special;
        }
    }

    static class Result {
        boolean valid;
        String message;

        Result(boolean valid, String message) {
            this.valid = valid;
            this.message = message;
        }
    }

    static class Engine {

        PasswordPolicy policy;

        Engine(PasswordPolicy policy) {
            this.policy = policy;
        }

        Result validate(String password) {

            if (password == null)
                return new Result(false, "Password cannot be null");

            if (password.length() == 0)
                return new Result(false, "Password cannot be empty");

            String msg = "";
            int len = password.length();

            if (len < policy.minLength)
                msg += "Too short. ";

            if (len > policy.maxLength)
                msg += "Too long. ";

            boolean upper = false;
            boolean lower = false;
            boolean digit = false;
            boolean special = false;
            boolean space = false;

            for (int i = 0; i < len; i++) {
                char c = password.charAt(i);

                if (c >= 'A' && c <= 'Z') upper = true;
                else if (c >= 'a' && c <= 'z') lower = true;
                else if (c >= '0' && c <= '9') digit = true;
                else if (c == ' ') space = true;
                else if (policy.special.indexOf(c) != -1) special = true;
            }

            if (!upper) msg += "Missing uppercase. ";
            if (!lower) msg += "Missing lowercase. ";
            if (!digit) msg += "Missing digit. ";
            if (!special) msg += "Missing special character. ";
            if (space) msg += "Contains whitespace. ";

            if (msg.equals(""))
                return new Result(true, "Password is valid");

            return new Result(false, msg);
        }
    }

    public static void main(String[] args) {

    try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

        PasswordPolicy policy = new PasswordPolicy(8, 32, "!@#$%^&*");
        Engine engine = new Engine(policy);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        Result result = engine.validate(password);

        System.out.println("Valid: " + result.valid);
        System.out.println("Message: " + result.message);
        }
    }
}