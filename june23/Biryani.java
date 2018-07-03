package june23;

public class Biryani {
	public String orderName;
	public String chaap;
	public String nutrila;
	public String rice;
	public String onion;
	public String saucesAndCurd;
	
	//@Override
	public String myToString() {
		return "Biryani contains: "+
				"\n name: "+this.orderName+
				"\n chaap: "+this.chaap+
				"\n nutrila: "+this.nutrila+
				"\n rice: "+this.rice+
				"\n onion: "+this.onion+
				"\n sauces and curds"+this.saucesAndCurd+
		"\n\n";
	}
}
