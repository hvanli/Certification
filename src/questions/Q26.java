 package questions;

public class Q26 {
	static int count=0;
	int i=0;
	
	public void changeCount() {
		while (i<5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Q26 check1=new Q26();
		Q26 check2=new Q26();
		check1.changeCount();// i=5, count=5
		check2.changeCount();// i=5, count=10--> count static degisken oldugundan degiskenin aldigi degerler her yerde korunur
							//   dolayisiyla ilk metod cagirildiginda 5 olmustu ikinci metod cagirildiginda 5 uzerine arttirilir.
		
		System.out.println(check1.count+" : "+check2.count);
		// hangi obj ile cagirilirsa cagirilsin static degiskenler son aldigi degerle gelir.
	}

}
