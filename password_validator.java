import java.util.regex.*;
import java.util.*;

class password_validator{
    public static boolean validate(String pwd)
    {
        String regex = "password1";
  
        Pattern p = Pattern.compile(regex);
        // System.out.println(p);
  
        if (pwd == null) {
            return false;
        }
  
        Matcher m = p.matcher(pwd);
        // System.out.println(m);
 
        return m.matches();
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
