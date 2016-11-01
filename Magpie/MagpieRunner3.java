import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner3
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie3 magpie = new Magpie3();
		int test = magpie.findKeyword("I know nothing about snow plows", "no",0);
		System.out.println (magpie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (magpie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
