import java.util.Scanner;
import java.util.ArrayList;
public class Coin {
	public static void main(String[] args){
		int numQuart = 0;
		int numDime = 0;
		int numNickel = 0;
		int numPenny = 0;
		Scanner input = new Scanner(System.in);
		int change = input.nextInt();
		int change1 = change;
		ArrayList <String> pos = new ArrayList<String>();
		for(int i = 0; i < change1+1; i++){
			change = change1;
			numQuart = 0;
			numDime = 0;
			numNickel = 0;
			numPenny = i;
			change = change - i;
			//System.out.println(numPenny);
			while(change >= 25){
				change = change - 25;
		     	numQuart++;
		     	//System.out.println(numQuart);
		     }
		     while(change >= 10 && change < 25){
		     	change = change - 10;
		     	numDime++;
		     	//System.out.println(numDime);
		     	
		     }
		     while(change >= 5 && change < 10){
		     	change = change -5;
		     	numNickel++;
		     	//System.out.println(numNickel);
		     }
		     while(change >= 1 && change < 5){
		     	change--;
		     	numPenny++;
		     	//System.out.println(numPenny);
		     }
		    int quart = numQuart *25;
			int dime = numDime *10;
			int nickel = numNickel*5;
		     if((quart + dime + nickel + numPenny) == change1){
		     	String L = (numQuart + " quarters, "+ numDime +" dimes "+ numNickel+ " nickels "+ numPenny +" pennies.");
		     	if(!pos.contains(L)){
		     		pos.add(L);
		     	}
		     }
		}
		for(int n = 0; n < pos.size(); n++){
			System.out.println(pos.get(n));
		}
		//System.out.println(pos);
	}
