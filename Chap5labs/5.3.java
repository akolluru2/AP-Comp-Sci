import java.util.Scanner;
public class RockPaperScissors{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Player 1: Choose rock, scissors, or paper:");
    String player1 = scan.next().toLowerCase();
    System.out.println("Player 2: Choose rock, scissors, or paper:");
    String player2 = scan.next().toLowerCase(); 
    if(player1.equals "rock" && player2.equals "scissor"){
      System.out.println("Player1 Wins");
    }else if(player1.equals "rock" && player2.equals "paper"){
      System.out.println("Player2 Wins");
    }else if(player1.equals "rock" && player2.equals "rock"){
      System.out.println("Draw");
    }else if(player1.equals "paper" && player2.equals "scissor"){
      System.out.println("Player2 Wins");
    }else if(player1.equals "paper" && player2.equals "paper"){
      System.out.println("Draw");
    else if(player1.equals "scissor" && player2.equals "scissor"){
      System.out.println("Draw");
    }else{
      System.out.println("Bad Input");
    }
  }
}
