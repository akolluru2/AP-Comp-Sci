public class twoD {

	public static void main(String[] args) {
		int [] [] twoD = new int[9][6];
		for(int i = 0; i < 9; i++){
			for(int j = 0 ; j < 6; j++){
				twoD[i][j] = (int) (Math.random()*20);
			}
		}
		for(int k = 0; k < 9; k++){
			for(int l = 0 ; l < 6; l++){
				System.out.print(twoD[k][l]+"\t");
			}
			System.out.println();
		}
	}
}
