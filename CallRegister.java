import java.util.Scanner;
public class CallRegister {
  static Scanner input = new Scanner(System.in);
  public static void mainMenu() {
    System.out.println("""
    1. Missed Calls
    2. Recieved Calls
    3. Erase recent lists 
    4. Dialled numbers 
    5. Show call duration
    6. Show calls costs
    7. Call cost settings
    8. Prepaid credit
    0. Back
  
    """);
    int choice = input.nextInt();
    switch (choice){
      case 1 -> {
        System.out.println("You have no missed calls!");
        mainMenu();
      }
      case 2 -> {
        System.out.println("You have no received calls!");
        mainMenu();
      }
      case 3 -> {
        System.out.println("You have no recent lists");
        mainMenu();
      }
      case 4 -> {
        System.out.println("You have not dialled any numbers");
        mainMenu();
      }
      case 8 -> {
        System.out.println("You have no prepaid credit");
        mainMenu();
      }
      case 5 -> callDuration();
      
      case 6 -> callCost();
      
      case 7 -> callCostSettings();
      
      case 0 -> Nokia5510.mainMenu();
      
      default ->{
        System.out.println("Invalid Option!");
        Nokia5510.mainMenu();
      }
    } //switch choice end
  
  } //main menu method end
  
  public static void callDuration() {
    System.out.println(
      """
        ==========CALL DURATION==========
        1. Last call duration
        2. All calls duration
        3. Dialled calls duration
        4. Clear timers
        0. Back
        Enter from the options(1 - 4) to access their functions and 0 to return
      """
      );
    int choice = input.nextInt();
    switch (choice) {
      case 1 -> {
        System.out.println("You have no history of calls!");
        System.out.println("Press 1 to return to previous menu or 0 to return to main menu");
        int user_choice = input.nextInt();
        if (user_choice == 1) {
          callDuration();
        }
        else if (user_choice == 0) {
          mainMenu();
        }
        else {
          System.out.println("Invalid option!");
          mainMenu();
        }
        
      }//case 1 end
      
      case 2 -> {
        System.out.println("You have no history of calls!");
        System.out.println("Press 1 to return to previous menu or 0 to return to main menu");
        int user_choice = input.nextInt();
        if (user_choice == 1) {
          callDuration();
        }
        else if (user_choice == 0) {
          mainMenu();
        }
        else {
          System.out.println("Invalid option!");
          mainMenu();
        }
      }//case 2 end
      
      case 3 -> {
        System.out.println("You have no history of calls!");
        System.out.println("Press 1 to return to previous menu or 0 to return to main menu");
        int user_choice = input.nextInt();
        if (user_choice == 1) {
          callDuration();
        }
        else if (user_choice == 0) {
          mainMenu();
        }
        else {
          System.out.println("Invalid option!");
          mainMenu();
        }
      }//case 3 end
      
      case 4 -> {
        System.out.println("You have no history of calls!");
        System.out.println("Press 1 to return to previous menu or 0 to return to main menu");
        int userChoice = input.nextInt();
        if (userChoice == 1) {
          callDuration();
        }
        else if (userChoice == 0) {
          mainMenu();
        }
        else {
          System.out.println("Invalid option!");
          mainMenu();
        }
      }//case 4 end
      
      case 0 -> {
        mainMenu();
      }//case 0 end
      
      default -> {
        System.out.println("Invalid Option!");
        mainMenu();
      }
        
    }//switch end
  }//call duration method end
  
  public static void callCost(){
    System.out.println("""
      1. Last call cost
      2. All call cost
      3. Clear Counters
      0. Back
      Enter either of the options (1 - 3) to access the functions or 0 to return
      """);
      int choice = input.nextInt();
      
      switch (choice) {
        case 1 -> {
          System.out.println("You have no call cost history.");
          System.out.println("Press 1 to return to previous menu or 0 to return to main menu");
          int user_choice = input.nextInt();
          if (user_choice == 1){
            callCost();
          }
          else if (user_choice == 0){
            mainMenu();
          }
          else{
            System.out.println("Invalid input!");
            mainMenu();
          }
        }//case 1 end
        case 2 -> {
          System.out.println("You have no call cost history.");
          System.out.println("Press 1 to return to previous menu or 0 to return to main menu");
          int user_choice = input.nextInt();
          if (user_choice == 1){
            callCost();
          }
          else if (user_choice == 0){
            mainMenu();
          }
          else{
            System.out.println("Invalid input!");
            mainMenu();
          }
        }//case 2 end
        case 3 -> {
          System.out.println("You have no counters to clear.");
          System.out.println("Press 1 to return to previous menu or 0 to return to main menu");
          int user_choice = input.nextInt();
          if (user_choice == 1){
            callCost();
          }
          else if (user_choice == 0){
            mainMenu();
          }
          else{
            System.out.println("Invalid input!");
            mainMenu();
          }
        }//case 3 end
        case 0 -> {
          mainMenu();
        }//case 0 end
        default ->{
          System.out.println("Invalid input!");
          mainMenu();
        }
      }//choice switch end
  }//call cost method end
  
  public static void callCostSettings() {
    System.out.println("""
      1. Call cost limit
      2. Show costs 
      Enter either of the options (1 - 2) above to access their functions or 0 to return
      """);
      int choice = input.nextInt();
      
      if (choice == 1) {
        System.out.println("Your call cost limit is 9,800");
      }
      else if (choice == 2) {
        System.out.println("Contact your service provider for charging unit prices");
      }
      else if (choice == 0) {
        mainMenu();
      }
      else {
        System.out.println("Invalid input!");
        mainMenu();
      }
  }//call cost settings method end
    
    

}
