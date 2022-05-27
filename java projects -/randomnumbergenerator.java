import java.util.*;
public class randomnumbergenerator{
    public static void main(String[] args) {
        int a= (int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the guess the random number generator game.....");
        System.out.println();
        int c=0;
        while (c<=10){
        System.out.println("Enter the number:");
        int b = sc.nextInt();
        if (a==b) {
            System.out.println("You won the game ....!!!");
            break;
        }
        else if (a>b){
            System.out.println("Enter bigger number:");
        }
        else if (a<b){
            System.out.println("Enter Smaller number:");
        }
        
        c++;

        }
        








    }
}