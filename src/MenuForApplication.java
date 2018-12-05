import java.util.Scanner;

public class MenuForApplication {
  public static void main(String[] args) {
    System.out.println("Menu");
    System.out.println("1. Draw the triangle");
    System.out.println("2. Draw the square");
    System.out.println("3. Draw the rectangle");
    System.out.println("0. Exit");

    Scanner input = new Scanner(System.in);
    int choice;

     do {
      System.out.println("Enter your choice: ");
      choice = input.nextInt();
      makeAChoice(choice);
       System.out.println("\n");
    } while (choice != 0 );
  }

  public static void makeAChoice(int choice) {
    switch (choice) {
      case 1:
        System.out.println("Draw the triangle");
        System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        break;
      case 2:
        System.out.println("Draw the square");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        break;
      case 3:
        System.out.println("Draw the rectangle");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        break;
      case 0:
        System.exit(0);
      default:
        System.out.println("No choice!");
    }
  }
}
