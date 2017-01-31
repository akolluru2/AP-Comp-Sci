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
		int current = -1;
		int previous = -1;
		int index = -1;
		for(int i = 0; i < values.length-1; i++){
			if(values[i] == values[i+1]){
				current++;
			}else if(values[i]!=values[i+1] && previous < current){
				previous = current;
				current = 0;
				index = i-previous;
			}
		}
	}
}
