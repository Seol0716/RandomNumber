package bronze;

import java.util.Scanner;

public class bj_1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//초기화
			int r = 1;
			
			for(int j = 0; j < b; j++) {
				
				r = (a * r) % 10;
				
				//조건
				//10번 컴퓨터 조건
				if(r == 0) {
					r = 10;
				}
				
			}
			
			System.out.println(r);
		}
		
	}
}
