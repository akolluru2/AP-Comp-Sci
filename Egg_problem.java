import java.util.Scanner;
import java.util.ArrayList;

public class Egg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello_World");
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num = input.nextInt();
			if(num % 5 ==1 && num % 4 == 1 && num % 6 == 1){
				System.out.println(num +" is a solution");
			}else{
				System.out.println(num + " is not a solution");
		}*/
		ArrayList nums= new ArrayList();
			for(int i = 0; i < 999999999; i++){
				if(i % 5 == 1 && i % 4 == 1 && i % 6 == 1 && i % 7 ==0){
					nums.add(i);
				}else{
					
			}
		}
		System.out.println(nums+ " are possible solutions");
	}

}
