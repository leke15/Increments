//**This Class is to collect a user's name and contact details as well as their favourite restaurant
// <p>
// it will be saved after being called in the main class and printed also this is to help show that
// I've learnt the concept and understood Docker and containerization
// @author Daniel Ayomidotun
// @version 1.0*/
public class UserObject {
 //User First Name
    public static String userName;
 //User Second Name
    public static String userSecondName;
 //User Email
    public static String userEmail;
 //User Phone number
    public static String userPhone;
 //User Favourite Restaurant
    public static String userFavoriteRestaurant;

    public UserObject(String name , String secondName , String phone , String email , String restaurant){
        userName = name;
        userSecondName = secondName;
        userPhone = phone;
        userEmail = email;
        userFavoriteRestaurant = restaurant;
    }

    public static void output(){
        String user = "User Name :" +" " +userName + " " + userSecondName+System.lineSeparator();
        user+=userName+" "+"phone number:" + " " + userPhone+System.lineSeparator();
        user+= userName+" "+"email :"+" "+ userEmail+System.lineSeparator();
        user+=userName+" "+ "favourite :"+" "+userFavoriteRestaurant+System.lineSeparator();
        System.out.println(user);
    }
}
