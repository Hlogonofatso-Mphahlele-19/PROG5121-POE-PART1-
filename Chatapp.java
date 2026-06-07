
package chatapp;

import java.util.Scanner;

public class Chatapp {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Register Your Account");
        
        System.out.print("Enter your first name: ");
        String firstName = kb.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = kb.nextLine();
        
        System.out.print("Enter your username: ");
        String username = kb.nextLine();
        
        System.out.print("Enter your password: ");
        String password = kb.nextLine();
        
        System.out.print("Enter your cellphone number: ");
        String cellPhoneNumber = kb.nextLine();
        
        Login user = new Login(username, password, cellPhoneNumber);
        
        String registrationResult = user.registerUser();
        System.out.println(registrationResult);
        
        if (registrationResult.equals("User registered successfully")) {
            System.out.println("Enter Details To Login");
            
            System.out.print("Enter your username: ");
            String loginUsername = kb.nextLine();
            
            System.out.print("Enter ur password: ");
            String loginPassword = kb.nextLine();
            
            boolean LoginSuccess = user.loginUser(loginUsername, loginPassword);
            
            System.out.println(user.returnLoginStatus(LoginSuccess, firstName, lastName));
             
        }
     
    }    
    
}
