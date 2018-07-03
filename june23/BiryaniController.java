package june23;

import june23.Biryani;

public class BiryaniController {
	public static void main(String a[]) {
		Biryani vegBiryani = new Biryani();
		System.out.println("biryani contains: "+vegBiryani.myToString());
		System.out.println("biryani ref var contains: "+vegBiryani.toString());
		vegBiryani.chaap = "10 pieces of chaap";
		vegBiryani.onion = "some spring onions";
		vegBiryani.nutrila = "10 pieces of nutrila";
		vegBiryani.rice = "400 gm Rice";
		vegBiryani.saucesAndCurd = "sauces and curd as desired";
		System.out.println("biryani contains: "+vegBiryani.myToString());
		System.out.println("biryani ref var contains: "+vegBiryani.toString());
	}
}
