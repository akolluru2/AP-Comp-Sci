public class names {

	public static void main(String[] args) {
		String [] fName = {"Andy", "Barbara", "Chandra", "Dyson", "Eric"};
		String [] mName = {"F.", "G.", "H.", "I."};
		String [] lName = {"Jackman", "Kincaid", "Lacy"};
		String [] names = new String [10];
		names[0] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[1] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[2] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[3] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[4] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[5] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[6] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[7] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[8] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		names[9] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		for(int i = 0; i < 10; i++){
			String name = names[i];
			System.out.println(name);
		}
	}
}
