package questions;

public class q18 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(8);
		sb.append("hello");
		
		// StringBuilder de bu iki delete metodu var.
		//		sb.delete(start index, end index)
		//		sb.deleteCharAt(index)
		
		sb.delete(0, sb.length());
		
	}
}
