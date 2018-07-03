package june23;

import java.util.ArrayList;
import java.util.List;

public class ForLoopTest {
	public static void main ( String args []) {
		Biryani vegBiryani = new Biryani();
		vegBiryani.chaap = "10 pieces of chaap";
		vegBiryani.onion = "some spring onions";
		vegBiryani.nutrila = "10 pieces of nutrila";
		vegBiryani.rice = "400 gm Rice";
		vegBiryani.saucesAndCurd = "sauces and curd as desired";
		vegBiryani.orderName = "b1";
		
		Biryani vegBiryani1 = new Biryani();
		vegBiryani1.chaap = "20 pieces of chaap";
		vegBiryani1.onion = "some more spring onions";
		vegBiryani1.nutrila = "20 pieces of nutrila";
		vegBiryani1.rice = "800 gm Rice";
		vegBiryani1.saucesAndCurd = "sauces and curd as desired";
		vegBiryani1.orderName = "b2";
		
		List<Biryani> bList = new ArrayList<>();
		bList.add(vegBiryani);
		bList.add(vegBiryani1);
		
		for ( Biryani a : bList ) {
			System.out.println(a.myToString());
			
		}
		
		
	}
}
