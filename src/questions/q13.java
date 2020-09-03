package questions;

public class q13 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(5);
		String s="";
		
		StringBuilder sb1=new StringBuilder("Hasan");
//		sb1="Hasan Vanli";
		sb1.append(" Vanli");
		System.out.println(sb1);
		
		sb1.deleteCharAt(2);
		System.out.println(sb1);
		
		sb1.replace(2,  5,  "Kemal");
		System.out.println(sb1);
		
		sb1.insert(6,  "ant");
		System.out.println(sb1);
		


		
		
//		String k=sb.toString();
//		System.out.println(k);      //bunlari bastirinca bos String cikiyor.
//		System.out.println("--");
//  	System.out.println(s);
//		System.out.println(sb);
		
		if (sb.equals(s)) { // iki farkli object i gosteriyorlar ayrica degiskenlerin turlari de farkli
			System.out.println("March 1");
		}else if (sb.toString().equals(s.toString())) { // her ikisi de bos string  eger null olsalardi nullPointExeption verirdi
			System.out.println("March 2");
		}else {
			System.out.println("No Match");
		}
		
	}
}
