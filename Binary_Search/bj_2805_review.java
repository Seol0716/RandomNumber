package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2805_review {

	static StringTokenizer st = null;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		int N= Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		
		int [] arr_int = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
        int start = 0;
		int end = 0;
		for(int i = 0; i < N; i++) {
			
			arr_int[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end,arr_int[i]);
		}
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			long sum = 0;
			
			
			for(int i : arr_int) {
				
				if(i > mid) {
					
					sum += i - mid;
				}
			}
			
			
//			//Upper Bound
//			if(sum < M) {
//			
//				end = mid;
//			}
//			
//			else {
//				start = mid + 1;
//			}
			
			//파라메트릭 서치
			if(sum >= M) {
				start = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
			
//			//Low Bound
			//실패ㅠㅠ
			//low bound는 최소값 다루는 문제에 활용
//			if(sum <= M) {
//				
//				end = mid - 1;
//				
//			}
//			
//			else {
//				start = mid + 1;
//			}
			
			//테스트
//			System.out.println(start + " " + end + " " + mid);
		}
		
		System.out.println(end);		
	}
}