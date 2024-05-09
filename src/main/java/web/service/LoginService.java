package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

    /**
     * Static method returns true for successful login, false otherwise.
     * 
     * @param username
     * @param password
     * @param dob
     * @return
     */
    public static boolean login(String username, String password, String dob) {
        // Check if any of the input parameters are null or empty
        if (username == null || username.isEmpty() || password == null || password.isEmpty() || dob == null
                || dob.isEmpty()) {
            return false;
        }

        // Trim leading and trailing whitespaces from inputs
        username = username.trim();
        password = password.trim();
        dob = dob.trim();

        // Check if the provided date of birth is in the correct format
        if (!dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        // Match a fixed user name and password.
        if ("vishal".equals(username) && "vishal_pass".equals(password) && "1997-11-15".equals(dob)) {
            return true;
        }

        return false;
    }
}

