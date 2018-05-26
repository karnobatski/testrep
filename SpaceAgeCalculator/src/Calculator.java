import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Calculator {
	
	private static DecimalFormat df = new DecimalFormat("#.##");
     
	public Calculator () {
		System.out.println("Give the person's age in seconds: ");
		calculate ();
    }
	
	public void calculate () {
		Scanner scanner = new Scanner(System.in);
		int userinput = scanner.nextInt();
		System.out.println("In Earth years, you are " + df.format(userinput/31557600));
		System.out.println("In Mercurian years, you are " + df.format((userinput/31557600)/0.2408467));
		System.out.println("In Venusian years, you are " + df.format((userinput/31557600)/0.61519726));
		System.out.println("In Martian years, you are " + df.format((userinput/31557600)/1.8808158));
		System.out.println("In Jovian years, you are " + df.format((userinput/31557600)/11.862615));
		System.out.println("In Saturnian years, you are " + df.format((userinput/31557600)/29.447498));
		System.out.println("In Uranian years, you are " + df.format((userinput/31557600)/84.016846));
		System.out.println("In Neptunian years, you are " + df.format((userinput/31557600)/164.79132));
		System.out.println("In Plutonian years, you are " + df.format((userinput/31557600)/248.00));
		
	}
	public static void main (String[] args) {
		Runnable r = new Runnable() {

			public void run() {
				new Calculator();

			}
		};
		SwingUtilities.invokeLater(r);
	}
}
