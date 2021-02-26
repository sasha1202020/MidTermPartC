/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author andre
 */
import java.util.Scanner;

public class TestUserprofile extends UserProfile {
    public static void main(String[]args){
        UserProfile user=new UserProfile();
        Scanner scan=new Scanner(System.in);
        String userID=scan.nextLine();
       user.setUserID(userID);
       System.out.println("Choose your favorite Genre:");
       for(int i=0;i<genres.length;i++){
           System.out.println(genres[i]);
           
            
        }
       String FavoriteGenre =scan.nextLine();
       if ("".equals(FavoriteGenre) || "".equals(userID)) {
           System.out.println("UserProfile was created");
        } else{
           System.out.println("error, please try again.")
       }
        
}
}