package june23;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String a[]) {
		Biryani vegBiryani = new Biryani();
		vegBiryani.chaap = "10 pieces of chaap";
		vegBiryani.onion = "some spring onions";
		vegBiryani.nutrila = "10 pieces of nutrila";
		vegBiryani.rice = "400 gm Rice";
		vegBiryani.saucesAndCurd = "sauces and curd as desired";
		vegBiryani.orderName = "b1";
		
		Biryani vegBiryani1 = new Biryani();
		vegBiryani1.chaap = "10 pieces of chaap";
		vegBiryani1.onion = "some spring onions";
		vegBiryani1.nutrila = "10 pieces of nutrila";
		vegBiryani1.rice = "800 gm Rice";
		vegBiryani1.saucesAndCurd = "sauces and curd as desired";
		vegBiryani1.orderName = "b1";
		
		if (vegBiryani == vegBiryani1) {
			System.out.println("oe");
			
		} else {
			System.out.println("one");

		}
		if (vegBiryani.myToString().equals( vegBiryani1.myToString())) {
			System.out.println("oe");
			
		} else {
			System.out.println("one");

		}
		
		
		int d;
		int b;
		Scanner sc = new Scanner(System.in);
		d = sc.nextInt();
		b = sc.nextInt();
		if (d % b == 0) {
			System.out.println("d is a factor of b");
	
		} else {
			System.out.println("d is not a factor of b");
			
		}
		
	
	
		
		
		
		
		
		
	}

}
