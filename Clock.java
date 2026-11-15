import java.util.Scanner;
public class Clock {
  static Scanner input = new Scanner(System.in);
  public static void mainMenu() {
    System.out.println("""
      >>>>>>>>>>CLOCK<<<<<<<<<<
      1. Alarm clock
      2. Clock settings
      3. Date settings 
      4. Stopwatch
      5. Countdown timer
      6. Auto update of date and time
      Enter either of the above options (1 - 5) to access their functions or 0 to exit.
    """);
      int choice = input.nextInt();
      switch (choice) {
        case 1 -> {
          System.out.println("You can set the alarm to go off at a desired time. Type in the time and press ok.");
          mainMenu();
        }
        case 2 -> {
          System.out.println("You can set the phone to show the current time in standby mode, adjust the time, or set the 12 hour or 24 hour format.");
          mainMenu();
        }
        case 3 -> {
          System.out.println("You can set the correct date.");
          mainMenu();
        }
        case 4 -> {
          System.out.println("You can measure time for different occasions. Sports, cooking, studying, etc.");
          mainMenu();
        }
        case 5 -> {
          System.out.println("You can set the phone to sound an alarm after a certain period of time.");
          mainMenu();
        }
        case 6 -> {
          System.out.println("This updates the clock in your phone in accordance with the current timezone");
          mainMenu();
        }
        case 0 -> Nokia5510.mainMenu();
        default -> {
          System.out.println("Invalid input!");
          mainMenu();
        }
      }
    
  }
}
