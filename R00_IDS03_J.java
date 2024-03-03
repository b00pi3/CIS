// RULE 00. INPUT VALIDATION AND DATA SANITIZATION

import java.util.logging.Logger;

public class R00_IDS03_J {
    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

    public static void main(String[] args) {

        // EXAMPLES VARS
        boolean loginSuccessful = authenticateUser("gaB33_21", "ThatkoolKidd#23");
        String username = "gaB33_21";

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanatizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanatizeUser(username);
        }
    }

    // checks to see if user and password are a match
    private static boolean authenticateUser(String username, String password) {
        // Example: check if username and password match in a database
        // Replace this with your actual authentication logic
        return username.equals("gaB33_21") && password.equals("ThatkoolKidd#23");
    }

    public String sanitizeUser(String name) {
        return Pattern.matches("[A-Za-z0-9]+", username))
            ? username : "unauthorized user";
}
