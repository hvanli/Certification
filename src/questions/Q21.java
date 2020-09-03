package questions;

public class Q21 {

	public static void main(String[] args) {
		Fieldinit f=new Fieldinit();
		f.printAll();
	}

}

class Fieldinit{
	char c;    	// ==>"" -->empty string
	boolean b; 	// ==> false
	double f;	// ==> 0.0
	void printAll() {
		System.out.println("c= "+c);
		System.out.println("b= "+b);
		System.out.println("f= "+f);
	}
}