import java.util.Scanner;

/**
 * a program that determine which numbers divide a user entered number evenly
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a positive integer
    System.out.println("Please enter a positive integer to determine its factors:");
    int n = input.nextInt();

    // create a variable to count up a number 
    int count = 0;

    // make sure the number is a positive integer
    while (n <= 0){
    // Ask for a new number
    System.out.println("Please enter a positive integer");
    n = input.nextInt();
    } 
    System.out.println("The factors of " + n +" are:");

    // find out the factors of the number
    do{
      count = count + 1;
    if(n%count == 0.0){
      System.out.println(count);
    } 
    }while (count < n);
    
  }
}
