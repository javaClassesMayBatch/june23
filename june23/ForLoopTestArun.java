package june23;

public class ForLoopTestArun {
	public static void main(String a[]) {
		int rows = 4;
		for (int rowNumber = 1; rowNumber <= rows ; rowNumber++) {
			for (int j = 3; j >= rowNumber; j--) {
				System.out.print(" ");  
	 		}
			for (int j = rowNumber; j > 1 ; j--) {
				System.out.print(j);  
	 		}
			for (int j = 1; j <= rowNumber; j++) {
				System.out.print(j);  
	 		}
	 		System.out.println();  
		}
		for (int rowNumber = rows-1; rowNumber >= 1; rowNumber--) {
			for (int j = 3; j >= rowNumber; j--) {
				System.out.print(" ");  
	 		}
			for (int j = rowNumber; j > 1 ; j--) {
				System.out.print(j);  
	 		}
			for (int j = 1; j <= rowNumber; j++) {
				System.out.print(j);  
	 		}
	 		System.out.println();  
	 	}	
	}

	
	 
	 /*
	 *   1
	 *  212
	 * 32123
	 *4321234
	 * 32123
	 * 	212
	 * 	 1
	 */
}
