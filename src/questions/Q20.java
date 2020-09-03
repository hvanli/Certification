package questions;

public class Q20 {

	public static void main(String[] args) {
		String str1="Java";
		String[] str2= {"J","a","v","a"};
		String str3="";
		for(String str:str2) {
			str3=str3+str;
		}//  bu durumda ==> str3="Java"
		
		boolean b1=(str1==str3); // icerik ayni da olsa ayni obj i gostermedikleri icin bu sekilde esit olmazlar.
		boolean b2=(str1.equals(str3)); // iki farkli obj icerikleri ayni mi boyle kontroledilir.
		System.out.println(b1+ ", "+b2);
	}
}
