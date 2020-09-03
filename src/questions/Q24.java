package questions;

public class Q24 {

	public static void main(String[] args) {
		int data[]= {2010,2013,2014,2015,2014};
		int key=2014;
		int count=0;
		for(int e:data) {
			if(e!=key) {// deger key degerine esit degilse if bloguna girecek. bu durumda 3 kere girer. 
				continue;	// ancak once continue ile karsilasacagindan altta kalan count a yetisemez .
				count++;	// dolayisiyla count hic artmaz ama ayni zamanda unrechable code oldugundan ==>compilation fails.
			}
		}
		System.out.println(count+ "Found");
	}
}
