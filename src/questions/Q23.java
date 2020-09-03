package questions;

public class Q23 {

	public static void main(String[] args) {
		Person2 p1=new Person2("Jasse");
		Person2 p2=new Person2("Walter", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}

class Person2{
	String name;
	int age=25;
	
	public Person2(String name) {
		this();		//==> paremetresiz constructer yok . neyi cagiriyor?
		setName(name);
	}
	
	public Person2(String name, int age) {
		Person2 (name);	//==>kendi constructerini ismiyle degil this keywordu ile cagirmasi gerekir.
		setAge(age);
	}
	
	// setter and getter methods go here
	
	public String show() {
		return name+" "+age;
	}
	
}