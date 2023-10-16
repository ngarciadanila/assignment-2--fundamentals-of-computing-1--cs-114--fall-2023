import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    int input;
    Scanner intScanner;

    System.out.println("Please enter a number:");
    intScanner = new Scanner (System.in);
    input = intScanner.nextInt();

    if (input % 2 == 1) { // tests if input is odd

      // top half of diamond
      for(int row = 0; row <= input/2; row ++) {
        for (int spaces = 0; spaces < (input / 2) - row; spaces++){
          System.out.print(" ");
      }
        for(int star = 0; star < 2 * row + 1; star++){
          System.out.print("*");
      }
      System.out.println();
      }

      // bottom half of diamond
      for (int row = input / 2 - 1; row >= 0; row--) {
        for (int spaces = 0; spaces< input / 2 - row; spaces ++){
          System.out.print(" ");
        }
        for (int star = 0; star < 2 * row + 1; star++){
          System.out.print("*");
        }
      System.out.println();
      }
    }else{ // when input is even

      // top half of diamond
      for(int row = 0; row < input; row ++) {
        for (int spaces = 0; spaces < input - row - 1; spaces++){
          System.out.print(" ");
      }
        for(int star = 0; star <= row; star++){
          System.out.print(" *");
      }
      System.out.println();
      }

      // bottom half of diamond
      for (int row = 0; row < input - 1; row++) {
        for (int spaces = 0; spaces <= row; spaces ++){
          System.out.print(" ");
        }
        for (int star = 0; star < input - row - 1; star++){
          System.out.print(" *");
        }
      System.out.println();
      }
      intScanner.close();
    }
  }
}
