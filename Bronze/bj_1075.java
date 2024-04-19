package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1075 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		//입력값의 끝자리 두개 00으로 만든다
		num /= 100; //앞자리
		num *= 100; //뒷자리
		
		int r = Integer.parseInt(br.readLine());
		
		int answer = 0;
		
		//num이 0으로 나누어떨어질때까지 반복
		while(num % r != 0) {
			
			num++;
			answer++;
			
		}
		
		if(answer < 10) {
			System.out.print("0" + answer);
		}
		
		else {
			System.out.print(answer);
		}	
	}
}
