package bronze;

import java.util.Scanner;

//개표
//같은 문자열만큼 카운터를 증가하고 Math.max로 누가 큰지 구하는 문제
public class bj_10102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String str = sc.next();
		
		
		int countA = 0;
		int countB = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'A') {
				
				countA++;
			}
			else {
				countB++;
			}
		}
		
		
		if(countA > countB) {
			System.out.print("A");
		}
		else if(countA < countB) {
			System.out.print("B");
		}
		else {
			System.out.print("Tie");
		}
	}
}
