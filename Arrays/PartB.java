import java.util.ArrayList;
public class names {

	public static void main(String[] args) {
		String [] fName = {"Andy", "Barbara", "Chandra", "Dyson", "Eric"};
		String [] mName = {"F.", "G.", "H.", "I."};
		String [] lName = {"Jackman", "Kincaid", "Lacy"};
		ArrayList<String> allName = new ArrayList<String>();
		for(int i = 0; i < fName.length; i++){
			for(int j = 0; j < mName.length; j++){
				for(int k = 0; k < lName.length; k++){
					allName.add(fName[i]+" "+mName[j]+" "+lName[k]);
				}
			}
		}
		System.out.println(allName);

	}

}
