import java.util.*;
import java.util.Scanner;

public class randomnumberupdatedgame {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Welcome to the guess the random number generator game.....");
        // System.out.println();
        System.out.println("=====================");
        try {
            int c = 0;
            int attempt = 0;
            while (c <= 10) {
                System.out.println();
                System.out.println("Enter any random number:");
                while (!sc.hasNextInt()) {
                    String aa = sc.next();
                    System.out.println("you entered: " + aa);
                    System.out.println(" Try again :(");
                }
                int b = sc.nextInt();
                if (a == b) {
                    System.out.println("You won the game ....!!!");
                    System.out.println("in : " + attempt + " attempts :)");
                    break;
                } else if (a > b) {
                    System.out.println("Enter BIGGER number:");
                    attempt++;
                } else if (a < b) {
                    System.out.println("Enter SMALLER number:");
                    attempt++;
                }
                c++;
                for (int i = 10; i < 0; i--) {
                    System.out.println("you only got " + i + "chance left");
                }
            }
        } catch (Exception e) {
            System.out.println("exception" + e);
        }
    }

}
