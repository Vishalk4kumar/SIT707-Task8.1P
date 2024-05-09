package web.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginServiceUnitTest {
	
	@Test
    public void testValidLogin() {
        assertTrue(LoginService.login("vishal", "vishal_pass", "1997-11-15"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(LoginService.login("invalid_user", "vishal_pass", "1997-11-15"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(LoginService.login("vishal", "invalid_pass", "1997-11-15"));
    }

    @Test
    public void testInvalidDOBFormat() {
        assertFalse(LoginService.login("vishal", "vishal_pass", "01-01-1997"));
    }

    // Add more test cases for boundary values, equivalence classes, etc.

    // Test case for verifying case sensitivity in username
    @Test
    public void testCaseSensitiveUsername() {
        assertFalse(LoginService.login("Vishal", "vishal_pass", "1997-11-15"));
    }

    // Test case for checking leading and trailing whitespaces in username and password
    @Test
    public void testWhitespaceInUsernameAndPassword() {
        assertFalse(LoginService.login(" vishal ", " vishal_pass ", "1997-11-15"));
    }

    // Test case for verifying login with a valid username, password, and date of birth
    @Test
    public void testValidLoginWithValidInputs() {
        assertTrue(LoginService.login("vishal", "vishal_pass", "1997-11-15"));
    }

    // Test case for verifying login with an invalid username, valid password, and valid date of birth
    @Test
    public void testInvalidUsernameWithValidPasswordAndDOB() {
        assertFalse(LoginService.login("invalid_user", "vishal_pass", "1997-11-15"));
    }

    // Test case for verifying login with a valid username, invalid password, and valid date of birth
    @Test
    public void testValidUsernameWithInvalidPasswordAndValidDOB() {
        assertFalse(LoginService.login("vishal", "invalid_pass", "1997-11-15"));
    }

    // Test case for verifying login with valid username, valid password, and invalid date of birth
    @Test
    public void testValidUsernameWithValidPasswordAndInvalidDOB() {
        assertFalse(LoginService.login("vishal", "vishal_pass", "01-01-1997"));
    }
}
