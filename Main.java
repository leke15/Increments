import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         String userName;
        //User Second Name
         String userSecondName;
        //User Email
         String userEmail;
        //User Phone number
         String userPhone;
        //User Favourite Restaurant
         String userFavoriteRestaurant;

// Collect and store User's contact information
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        userName = scanner.nextLine();
        System.out.println("Enter your Second Name");
        userSecondName = scanner.nextLine();
        System.out.println("Enter your Phone Number... No worries we'll try to text you at regular times ;)");
        userPhone = scanner.nextLine();
        System.out.println("Enter your fav restaurant... Yes we're planning to take you out ;)");
        userFavoriteRestaurant = scanner.nextLine();
        System.out.println("Enter your email... Just in case we can't reach your number");
        userEmail = scanner.nextLine();

        UserObject newUser = new UserObject(userName,userSecondName,userPhone,userEmail,userFavoriteRestaurant);
        UserObject.output();

    }
}