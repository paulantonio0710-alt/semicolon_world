import java.util.Scanner;
public class Tones {
  static Scanner input = new Scanner(System.in);
  public static void mainMenu(){
    System.out.print("""
      ++++++++++TONES++++++++++
      1. Ringing tones
      2. Ringing volume
      3. Incoming call alert
      4. Message alert tone
      5. Keypad tones
      6. Warning tones
      7. Vibrating alert
      8. Screen saver
      
      Enter either of the above options (1 - 8) to access their functions or 0 to return
    """);
    int choice = input.nextInt();
    
    switch (choice) {
      case 1 -> {
        System.out.println("Go to the App Store to import ringtones to your device.");
        mainMenu();
      }//case 1 end
      case 2 -> {
        
      }//case 2 end
      case 3 -> {
        String alertState = "";
        System.out.printf("Incoming call alert is not set. Press 1 to turn it on or 2 turn it off ");
        int alertChoice = input.nextInt();
        if (alertChoice == 1){
          alertState = "on";
        }
        else if (alertChoice == 2){
          alertState = "off";
        }
        else{
          System.out.println("Invalid Option!");
          mainMenu();
        }
        
        System.out.printf("Incoming call alert is now %s", alertState);
        System.out.println("Enter 1 to return");
        int userChoice = input.nextInt();
        
        if (userChoice == 1) {
          mainMenu();
        }
        else {
          System.out.println("Invalid Option!");
          mainMenu();
        }
        
      }//case 3 end
      
      case 4 -> {
        System.out.println("Go to the App Store to import message ringtones to your device.");
        mainMenu();
      }//case 4 end
      
      case 5 -> {
        System.out.println("Go to the App Store to import keypad tones to your device.");
        mainMenu();
      }//case 5 end
      
      case 6 -> {
        System.out.println("Warning tone is Galaxy bells by default. Navigate to media player to change");
        mainMenu();
      }//case 6 end
      
      case 7 -> {
        System.out.println("Vibration is set for call, notifications, system and media. Navigate to main settings to change");
        mainMenu();
      }//case 7 end
      
      case 8 -> {
        System.out.println("Screen saver is not set. Go to folders to set it");
        mainMenu();
      }//case 8 end
      
      case 0 -> {
        Nokia5510.mainMenu();
      }
      
      default -> {
        System.out.println("Invalid Option!");
        mainMenu();
      }
    }//choice switch end
    
  }//main menu method end
}//class end
