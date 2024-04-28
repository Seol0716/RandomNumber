package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2512_review {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		int start = 0;
		int end = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < num; i++) {
			
			int number  = Integer.parseInt(st.nextToken());
			arr_int.add(number);
			
			end = Math.max(end, arr_int.get(i));
			
		}
		
		int K = Integer.parseInt(br.readLine());
		
		while(start <= end) {
			
			 int mid = (start + end) / 2;
			 long sum = 0;
			 
			 for(int i : arr_int) {
				 
				 //세금을 낼 수 있는 경우
				 if(i > mid) {
					 
					 sum += mid;
				 }
				 
				 //낼 수 없으면 가진 돈 전부 낸다
				 else {
					 sum += i;
				 }
			 }
			 
			 //주어진 예산보다 작은경우 범위를 높인다
			 //범위를 낮춰 다시 검사
			 
			 if(sum <= K) {
		
				 start = mid + 1;
			 }
			 
			 else {
				 end = mid - 1;
			 }
		}
		
		System.out.println(start);
	}

}
