import java.util.ArrayList;
public class Array {
	/*public static void main(String[]args){
		int cube = 6;
		int numTosses = 10;
		int[] tosses = new int[numTosses];
		for(int i = 0; i < tosses.length; i++){
			tosses[i] = (int)(Math.random()*cube+1);
			System.out.println(tosses[i]);
		}
	}*/
	public Array(){
		
	}
	public static int[] getCubeToss(numberCube cube, int numTosses){
		int[] tosses = new int[numTosses];
		for(int i = 0; i < tosses.length; i++){
			tosses[i] = cube.toss();
		}
		return tosses;
	}
	public static int getLongestRun(int[] values){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < values.length-1; i++){
			if(values[i] == values[i+1]){
				nums.add(values[i]);
			}
		}
		for(int i = 0; i < nums.siz(); i++){
			
		}
	}
}
