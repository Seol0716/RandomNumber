package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;

public class bj_15810 {

	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int number = Integer.parseInt(st.nextToken());
			arr_int.add(number);
		}
		
        Collections.sort(arr_int);
		long start = 0;
		long end = (long)arr_int.get(0) * (long)M;
		
		while(start <= end) {
			
			long mid = (start + end) / 2;
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				
				//배수일때 카운터 증가
				count += mid / arr_int.get(i);
			}
			
			if(count < M) {
				start = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
			
////			//최대
////			if(count < M) {
////				start = mid + 1;
////			}
////			
////			else {
////				end = mid-1;
////			}
//			
//			
//			//최소
////						
////			if(count >= M) {
////				end = mid - 1;
////			}
////			
////			else {
////				start = mid + 1;
////			}
	
			System.out.println(start + " " + end + " " + mid);
		}
		
		System.out.println(start);
	}
}
