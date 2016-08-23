
//  Akhil Kolluru
//  7/28/16
//  Jackpot.java
//  Prompt the user to enter the number of
//  sides for the 3 dice to be rolled.  This
//  user input will be checked, and the user
//  will be reprompted if they make an error.
//  The 3 dice are then constructed using
//  the value entered by the user.  The dice
//  are then rolled until all 3 dice show the
//  same face value.  A count is also recorded
//  and shown as the 3 dice are rolled.
import java.util.Scanner;

public class Jackpot{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides do you want the dice to have?");
        int sides = input.nextInt();
        int[] dice = new int[3];
        int counter = 0;
        for(int i = 0; i < dice.length; i++) {
            dice[i] = (int) (Math.random() * sides + 1);
            System.out.print(dice[i] + "|");
        }
        counter++;
        System.out.println("Roll number "+counter);
        if( sides <= 0){
            System.out.println("Enter a number higher than 0");
            sides = input.nextInt();
        }else{
            while(dice[0] != dice[1] || dice[1] != dice[2] || dice[0] != dice[2]){
                for(int i = 0; i < dice.length; i++) {
                    dice[i] = (int) (Math.random() * sides + 1);
                    System.out.print(dice[i] + "|");

                }
                counter ++;
                System.out.println("Roll number "+counter);
            }
        }
    }
}
