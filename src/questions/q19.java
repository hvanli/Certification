package questions;

public class q19 {

	private char var;
	public static void main(String[] args) {
		
		char var1='a';
		char var2=var1;
		var2='e'; // var2 ye ikinci kez atama yapiliyor var2=e
		
		q19 obj1=new q19();// class ismi sorularda Vowel 
		q19 obj2=obj1; //obj2 diye yeni bir obj olusturulmuyor. obj2 obj1 i gosteriyor
		
		obj1.var='i';
		obj2.var='o';// her ikisi de ayni obj gosterdiklerine gore bu atama son atama oldugundan her ikisinin de degeri bu olur.
		
		System.out.println(var1+", "+var2);
		System.out.println(obj1.var+ ", "+obj2.var);
		
	}
}

