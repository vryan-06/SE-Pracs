import java.util.regex.*;
import java.util.*;

class password_validator{
    public static boolean validate(String pwd)
    {
        String password = "password1";
        
        if (pwd == null) {
            return false;
        }
  
        if(pwd.matches(password)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password\n");
        String enteredPassword = sc.nextLine();
        
        if(validate(enteredPassword)==true){
            System.out.println("Correct password");
        }
        else{
            System.out.println("Incorrect password");
        }
        
    }
}
