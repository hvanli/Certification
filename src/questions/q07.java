package questions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q07 {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.of(2014, 7, 31, 1, 1);
		dt.plusDays(30);// burdaki metodlarin sonuclari bir degiskene atanmadigi surece bir degisiklik yaratamaz.
		dt.plusMonths(1);// conku local date de String gibi immutable dir.
		
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		
		LocalDateTime dt1=LocalDateTime.of(2020,  2,  6,  1,  22);
		System.out.println(dt1.format(DateTimeFormatter.ISO_DATE));
		System.out.println(dt1.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(dt1.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(dt1.format(DateTimeFormatter.ISO_LOCAL_TIME));

	}

}

// of methodu ==> LocalDateTime.of(2014, 7, 31, 1, 1) bu sekilde yazilir sonuc 2014-07-31 bu formatta doner
// bir de parse metodu var o da String halindeki tarihi donusturuyor.