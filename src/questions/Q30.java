package questions;

public class Q30 {

	public static void main(String[] args) {
		int n [][]= {{1,3},{2,4}};
		for (int i = n.length-1 ;  i>=0 ; i--) {// tersten okuyor 
			for(int y:n[i]) {			// duz okuyor--- zaten for each loop tersten okuyamaz
				System.out.print(y);
			}
		}
	}

}

src/test/resources/Features
