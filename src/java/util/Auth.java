package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junior
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
