import java.util.Scanner;
public class Settings {
   static Scanner input = new Scanner(System.in);
  public static void mainMenu() {
    System.out.println("""
        ==========Settings==========
        1. Call settings
        2. Phone settings
        3. Security settings
        4. Restore factory settings
        Enter either of the options above (1 - 4) or 0 to return 
      """);
        int choice = input.nextInt();
        switch(choice){
          case 1 -> callSettings();
          case 2 -> phoneSettings();
          case 3 -> securitySettings();
          case 4 -> System.out.println("You can reset the menu settings to their original values");
          }
          
      
  }
  
  public static void callSettings() {
    System.out.println("""
        __________CALL SETTINGS__________
        1. Automatic redial
        2. Speed dialing
        3. Call waiting options
        4. Own number sending
        5. Phone line in use
        6. Automatic answer
        Enter either of the following options above (1 - 6) or 0 to return
      """);
        int choice = input.nextInt();
        switch(choice) {
          case 1 -> {
            System.out.println("Automatic redial is on");
            callSettings();
          }//case 1 end
          case 2 -> {
            System.out.println("Automatic redial is on");
            callSettings();
          }//case 2 end
          case 3 -> {
            System.out.println("Insert a SIM card to access this function");
            callSettings();
          }//case 3 end
          case 4 -> {
            System.out.println("Insert a SIM card to access this function");
            callSettings();
          }//case 4 end
          case 5 -> {
            System.out.println("Insert a SIM card to access this function");
            callSettings();
          }//case 5 end
          case 6 -> {
            System.out.println("Insert a SIM card to access this function");
            callSettings();
          }//case 6 end
          case 0 -> {
            mainMenu();
          }//case 0 end
          default -> {
            System.out.println("Invalid Option!");
            mainMenu();
          }
          
        }
  }
  public static void phoneSettings(){
    System.out.println("""
        **********PHONE SETTINGS**********
        1. Language 
        2. Cell info display
        3. Welcome note
        4. Network selection
        5. Confirm SIM service actions
        Enter either of the following options above (1 - 5) or 0 to return:
      """);
      int choice = input.nextInt();
      switch(choice) {
        case 1 -> {
          System.out.println("The default language is set to English.\n You can select the language for the display text.");
          mainMenu();
        }//case 1 end
        case 2 -> {
          System.out.println("You can set your phone to indicate when it is used based on MCN.");
          mainMenu();
        }//case 2 end
        case 3  -> {
          System.out.println("You can write a message which is shown briefly when the phone is switched on.");
          mainMenu();
        }//case 3 end
        case 4 -> {
          System.out.println("Insert a SIM card to access this function");
          mainMenu();
        }//case 4 end
        case  5 -> {
          System.out.println("Insert a SIM card to access this function");
          mainMenu();
        }//case 5 end
        case 0 -> 
          mainMenu();
        default -> {
          System.out.println("Invalid Option!");
          mainMenu();
        }
      }
  }
  
  public static void securitySettings()  {
    System.out.println("""
        ##########SECURITY SETTINGS##########
        1. PIN code request
        2. Call barring service
        3. Fixed dialing
        4. Closed user group
        5. Security level
        6. Change access  codes
        Enter either of the options above (1 - 6) to access their functions or 0 to return:                                                 
      """);
      int choice = input.nextInt();
      
      switch(choice) {
        case  1 -> {
          System.out.println("Insert a SIM card to access this function");
          securitySettings();
        }//case 1  end
        case 2 -> {
          System.out.println("With this network you can restrict the making and receiving of calls with your phone.");
          securitySettings();
        }//case 2 end
        case 3 -> {
          System.out.println("You can restrict your outgoing calls to selected numbers.");
          mainMenu();
        }//case 3 end
        case 4 -> {
          System.out.println("With your network service, you can specify a group of people who you can call and call you. ");
          securitySettings();
        }//case 4 end
        case 5 -> {
          System.out.println("You can set the phone to ask for the security code when a new SIM card is inserted.");
          securitySettings();
        }//case 5 end
        case 6 -> {
          System.out.println("You can call change the security code, PIN code, PIN2 code, or barring password");
          securitySettings();
        }//case 6 end
        case 0 -> mainMenu();
        default -> {
          System.out.println("Invalid option!");
          mainMenu();
        }
      }
      
  }
}
