import java.util.Scanner; 
public class Nokia5510{
  static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {
    mainMenu();
  }
  
  
  public static void mainMenu() {
    System.out.println("""
            MAIN MENU
      1. Phonebook
      2. Messages
      3. Chat
      4. Call register
      5. Tones
      6. Settings
      7. Call divert
      8. Music
      9. Games
      10. Calculator
      11. Reminders
      12. Clock
      13. Profiles
      14. Services 
      15. SIM services
      Enter option (1 - 15) to access functions or 0 to exit
      """);
      int choice = input.nextInt();
      switch(choice) {
        case 1 -> phoneBookMenu();
        case 2 -> messagesMenu();
        case 3 -> System.out.println("Insert a sim card to chat with family and friends.");
        case 4 -> CallRegister.mainMenu();
        case 6 -> Settings.mainMenu();
        case 5 -> Tones.mainMenu();
        case 7 -> {
            System.out.println("You can direct your incoming calls to your voice mailbox or some other phone number.");
            mainMenu();
        }
        case 0 -> {
          System.out.println("Exiting now.....");
          break;
          }
        case 8 ->  Music.mainMenu();
        case 9 -> {
          System.out.println("Go to your app store to download games to play. ");
          mainMenu();
        }
        case 10 -> {
          System.out.println("Go to your app store to download Calculator");
          mainMenu();
        }
        case 11 -> {
          System.out.println("You have no reminders set.");
          mainMenu();
        }
        case 12 -> Clock.mainMenu();
        case 13 -> {
          System.out.println("There are no other profiles on this device.");
          mainMenu();
        }
        case 14 -> {
          System.out.println("Insert a SIM card to be able to access this function.");
          mainMenu();
        }
        case  15 -> {
          System.out.println("To access this function, insert a SIM card.");
          mainMenu();
        }
        default -> {
          System.out.println("Invalid input");
          mainMenu();
          }
     } 
    }//main menu method end
  
  
  public static void phoneBookMenu() {
      System.out.println("""
        ++++++++++PHONE BOOK MENU----------
        1. Search
        2. Service Nos
        3. Add Name
        4. Erase
        5. Edit
        6. Copy
        7. Assign tone
        8. Send b'card
        9. Options
        10.Speed dials
        11. Voice tags
        0. Back
        Select from options above to access functions.
        """);
      int choice = input.nextInt();
      switch(choice){
        case 1 -> {
          System.out.println("You can recall the desired name and number from the phone book to make a call.");
          mainMenu();
        }
        case 3 -> addContact();
        case 2 -> {
          System.out.println("Insert a SIM card to be able to access this function.");
          mainMenu();
        }
        case 0 -> mainMenu();
        case 4 -> {
          System.out.println("There are no saved contacts on this device.");
          mainMenu();
        }
        case 5 -> {
          System.out.println("There are no contacts to edit on this device.");
          mainMenu();
        }
        case 6 -> {
          System.out.println("There are no contacts to copy on this device.");
          mainMenu();
        }
        case 7 -> {
          System.out.println("There are no contacts to assign a tone to on this device.");
          mainMenu();
        }
        case 8 -> {
          System.out.println("There are no contacts to send a birthday message to on this device.");
          mainMenu();
        }
        case 9 -> options();
        case 10 -> {
          System.out.println("Insert a SIM card to be able to access this function.");
          mainMenu();
        }
        case 11 -> {
          System.out.println("There are no saved voice tags on this device.");
          mainMenu();
        }
        default -> {
          System.out.println("Invalid option");
          phoneBookMenu();
        }
      }
  }//phone book menu method end
  public static void options()  {
    System.out.println("""
      >>>>>>>>>>OPTIONS<<<<<<<<<<
      1. Memory in use
      2. Type of view
      3. Memory Status
      Enter from the options above (1 - 3) or 0 to return 
      """);
      int choice = input.nextInt();
      
      switch(choice) {
        case 1 -> {
          System.out.println("You can select whether the name and phone numbers are saved on your SIM or on this device.");
          options();
        }
        case 2 -> {
          System.out.println("You can select the way saved numbers are displayed on this device.");
          options();
        }
        case 3 -> {
          System.out.println("There are no saved numbers on this device.");
          options();
        }
        case 0 -> mainMenu();
        default -> {
          System.out.println("Invalid Option!");
          options();
        }
      }
  
  }
  
  
  
  
  public static void addContact() {
    System.out.println("Enter number: ");
    String number = input.next();
    System.out.println("Enter name: ");
    String name = input.next();
    System.out.println("Insert a SIM card to be able to save contacts");
    System.out.println("Enter 1 to go back or 0 to go to the main menu");
    int userChoice = input.nextInt();
    if (userChoice == 1){
      phoneBookMenu();
    }
    else if (userChoice == 0) {
      mainMenu();
    }
    else {
      System.out.println("Invalid Option");
      mainMenu();
    }
    
    
    
  }//add contact method end
  
  
  public static void messagesMenu(){
    System.out.print("""
          MESSAGES MENU
      Enter either of the following options:
        1. Send Text
        2. Inbox
        3. Outbox
        0. Back
    
    """);
    int choice = input.nextInt();
    switch(choice) {
      case 1 -> sendText();
      case 2 -> {
        System.out.println("You have no new messages.");
        messagesMenu();
      }
      case 3 -> {
        System.out.printf("You have no messages in outbox.");
        messagesMenu();
      }
      case 0 -> mainMenu();
      default -> {
        System.out.println("Invalid option.");
        messagesMenu();
      }
    }
  }//messages menu method end
    
    
    public static void sendText() {
      System.out.println("Enter entire text below in a single line. Then press Enter to send:");
      input.nextLine();
      System.out.println("Press  any number to send");
      input.next();
      System.out.println("""
        Message not sent. Please insert a SIM card to be able to send messages.

        """);
        messagesMenu();
    }
  
  }
  
  
  
  
  
  

