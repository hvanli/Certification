package questions;

public class q17 {

	public static void main(String[] args) {       // STRING IS IMMUTABLE
		String str=" "; 
		str.trim();// String immutable oldugundan uygulanan trim metodu asil str yi degistirmez 
					//ancak str.trim() baska bir degiskene atanirsa gorunur olur.
		
//		String s=str.trim();
//		System.out.println(s.equals("")+" "+str.isEmpty());
		
		
		System.out.println(str.equals("")+" "+str.isEmpty());
		System.out.println(str);
	}
}
