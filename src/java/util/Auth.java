package util;
/**
 *
 * @author junior, igor
 */
public class Auth {
    
    public static boolean login(String email, String password){
        String userPassword =  new StringBuilder(email.split("@")[0]).reverse().toString();
        
        if(password.equals(userPassword)){
            return true;
        }
        return false;
    }
    
}
