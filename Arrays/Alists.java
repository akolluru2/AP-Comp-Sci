import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Alists {
	public static void main(String[]args){
		// 15.2*********************************************************
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
		
		// 15.3*******************************************************
		/*ArrayList<Integer> nums = new ArrayList<Integer>();
		try{
		Scanner in = new Scanner(new FileReader(new File("numbers.txt")));
		Scanner input = new Scanner(new FileReader(new File("numbers.txt")));

		int sum = 0;
		int counter = 0;
		while(in.hasNextInt()){
			int randNum = in.nextInt();
			nums.add(randNum);
			sum = sum + randNum;
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
			
		//things
		int maxCount = 0;
		for (int i = 0; i < nums.size(); i++) {
			int value = nums.get(i);
			int count = 1;
			for (int j = 0; j < nums.size(); j++) {
			    if (numes.get(j) == value)
				count++;
			    if (count > maxCount) {
				mode = value;
				maxCount = count;
			    }
			}
		}
		System.out.println(mode);
		}catch(IOException e){
			e.printStackTrace();
		}*/
	}
}
