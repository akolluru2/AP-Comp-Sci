import java.util.Scanner;

public class Compound_Interest{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price of the car");
        double c_pri = input.nextDouble();
        System.out.println("The amount of money you have");
        double start = input.nextDouble();
        System.out.println("Please enter the interest rate");
        double in_rate = input.nextDouble();
        System.out.println("Please enter the amount saved each month");
        double sav = input.nextDouble();
        int months = 0;
        while(start < c_pri) {
            months++;
            start += in_rate;
            if(months % 12 == 0) {
                start = start * (1 + in_rate/100);
            }
        }
        int years = 0;
		while(months >= 12) {
			months -=12;
			years++;
		}
        System.out.println("It will take you "+years+" years and "+months+" months to save up for your car.");
    }
}
