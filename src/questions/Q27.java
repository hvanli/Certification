package questions;

public class Q27 {
	public static void main(String[] args) {
		
		Product1 p1=new Product1(101, "Pen");
		Product1 p2=new Product1(101, "Pen");
		Product1 p3=p1;  // p1 ile ayni obj i gosteriyor
		boolean ans1= p1==p2; // ayni paremetreleri almis farkli objectler
		boolean ans2=p1.name.equals(p2.name); // isimler ayni
		System.out.println(ans1+" ; "+ans2);
	}
}

class Product1{
	int id;
	String name;
	
	public Product1(int id, String name) {
		this.id=id;
		this.name=name;
	}
}