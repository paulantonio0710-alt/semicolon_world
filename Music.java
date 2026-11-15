import java.util.Scanner;
public class Music {
  static Scanner input = new Scanner(System.in);
  public static void mainMenu() {
    System.out.println("""
      **********MUSIC**********
      1. Music player
      2. Radio
      3. Recorder
      4. Track list
      Enter either of the above options (1 - 4) to access their functions or 0 to exit.
      """);
      int choice = input.nextInt();
      
      switch(choice) {
        case 1 -> {
          System.out.println("With the music player, you can listen to Music tracks you have stored on your phone.");
          mainMenu();
        }
        case 2 -> {
          System.out.println("You can listen to the FM radio in your phone by using the HDD-2 headset");
          mainMenu();
        }
        case 3 -> {
          System.out.println("You can record music directly from the FM radio in your phone, or you can connect your phone to external audio equipment.");
          mainMenu();
        }
        case 4 -> {
          System.out.println("You can view and play the music tracks you have stored on your phone.");
          mainMenu();
        }
        case 0 -> Nokia5510.mainMenu();
        default -> {
          System.out.println("Invalid option!");
          mainMenu();
        }
      }
  }
}
