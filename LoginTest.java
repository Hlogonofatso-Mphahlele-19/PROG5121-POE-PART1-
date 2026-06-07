
package chatapp;


import chatapp.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    
    // Tests for valid and invalid username formats
    
    @Test
    public void testValidUsernameFormat() {
        Login user =  new Login("lse_1", "L!0nsin#2c@nor", "+27852147963");
        assertTrue(user.checkUserName());
    }
    @Test
    public void testInvalidUsernameFormat() {
        Login user =  new Login("liosin!!!!", "L!onsin#2c@nor", "+27147369852");
        assertFalse(user.checkUserName());
    }
    
    // Tests for valid and invalid password fomats
    @Test
    public void testValidPasswordFormat() {
        Login user =  new Login("l_se2", "S!n0#prid3esc@n0r!!", "27854712693");
        assertTrue(user.checkPasswordComplexity());
    }
    @Test
    public void testInvalidPasswordFormat() {
        Login user =  new Login("ls_e2", "paswod", "+27325418796");
        assertFalse(user.checkPasswordComplexity());
    }
    
    // tessts for validand invalid cellphone numerFormats
    @Test
    public void testValidCellPhoneNuberFormat() {
        Login user =  new Login("ls_3e", "Esc@n0rs!nofpr!d3", "+27123456789");
        assertTrue(user.checkUserName());
    }
    @Test
    public void testInvalidCellPhoneNumberFormat() {
        Login user =  new Login("l3_se", "P!nn@cl3of@llrac3s", "1023456789");
        assertFalse(user.checkUserName());
    }
    
    //Tests for successful logins and unsucessful logins
    @Test
    public void testSuccessfulLogin() {
        Login user = new Login("lse_4", "Str0ngests!n", "+27985632471");
        assertTrue(user.loginUser("lse_4", "Str0ngests!n"));
    }
    @Test
    public void testUnsuccessfulLogin() {
        Login user = new Login("lse_4", "Str0ngests!n", "+27985632471");
        assertFalse(user.loginUser("Wrong username", "Wrong passwod"));
    }
}
