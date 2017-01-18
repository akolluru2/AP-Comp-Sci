import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Alists {
	public static void main(String[]args){
		/*ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> rands = new ArrayList<Integer>();
		int a = 0;
		while(a<10){
			for(int i = 1; i < 11; i++){
				nums.add(i);
			}
			for(int j = 0; j < 10; j++){
				int b = (int)((Math.random()*nums.size()));
				rands.add(nums.get(b));
				nums.remove(b);
				
			}
			System.out.println(rands);
			rands.clear();
			a++;
		}*/
		//ArrayList<Integer> nums = new ArrayList<Integer>();
		try{
		Scanner in = new Scanner(new FileReader(new File("numbers.txt")));
		Scanner input = new Scanner(new FileReader(new File("numbers.txt")));

		int sum = 0;
		int counter = 0;
		while(in.hasNextInt()){
			sum = sum + in.nextInt();
			counter++;
			//System.out.print("!");
		}
		int avg = sum/counter;
		sum = 0;
		counter = 0;
		while(input.hasNextInt()){
			//System.out.print("!");
			int l = input.nextInt()- avg;
			int j = l*l;
			sum = sum + j;
			//System.out.println(sum);
			counter++;
		}
		int deviation =(int) (Math.sqrt(sum/(counter-1)));
		System.out.println(avg);
		System.out.println(deviation);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
