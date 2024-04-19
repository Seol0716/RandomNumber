package bronze;

import java.util.Scanner;

public class bj_1032_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char first = 0;

		//문자열 char로 변환
		for(int i = 0; i < num; i++) {
			
			char [] arr_ch = sc.nextLine().toCharArray();
			
			first = arr_ch[0];
			
			for(int j = 0; j < first; j++) {
				
				if(first != arr_ch[j] ) {
					first = '?';
				}
			}
		}
		
		System.out.print(first);
		
	}

}
