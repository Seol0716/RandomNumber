package bronze;

import java.text.SimpleDateFormat;
import java.util.Date;

public class bj_10699 {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		System.out.println(today);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(today));
		
		

	}

}
