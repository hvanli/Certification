package questions;

public class Q28 {

	public static void main(String[] args) {
		String ta="A ";
		ta=ta.concat("B ");
		String tb="C ";
		ta=ta.concat(tb);
		ta.replace('C', 'D');// yaptigi degisikligi herhangi bir degiskene atamadigi icin etkisiz kaliyor.
							 // STRING IS IMMUTABLE  String tc=ta.replace('C', 'D'); gibi ..
		ta=ta.concat(tb);
		System.out.println(ta);
	}
}
