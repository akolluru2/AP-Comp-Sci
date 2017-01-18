import java.util.ArrayList;
public class Alists {
	public static void main(String[]args){
		ArrayList<Integer> nums = new ArrayList<Integer>();
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
		}	
	}
}
