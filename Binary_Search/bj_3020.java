package pratice;

import java.util.Scanner;

public class bj_3020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		
		int [] s = new int[H + 1];
		int [] j = new int[H + 1];
		
		for(int i = 0; i < N/2; i++) {
			
			int sh = sc.nextInt();
			int jh = sc.nextInt();
			
			//장애문 설치
			s[sh]++;
			j[jh]++;
		}
		
		//부분 합
		for(int i = H; i > 0; i--) {
			
			s[i - 1] = s[i] + s[i - 1];
			j[i - 1] = j[i] + j[i - 1];
			
		}
		
		//최소구간 찾기
		int min = Integer.MAX_VALUE;
		int count = 0;
		
		for(int i = 1; i <= H; i++) {
			
			//깨진 장애물 수
			//s[1] + j[7] s[2] + j[6]...
			int temp = s[i] + j[H+ 1 - i];
			
			//최소로 깨진 장애물수 판별
			if(temp < min) {
				min = temp;
				count = 1;
			}
			
			//똑같은 구간이 나왔을때
			else if(temp == min) {
				count++;
			}
		}
		
		//최소 장애물수, 최소 장애물 구간 카운터
		System.out.println(min + " " + count);
	}
}
