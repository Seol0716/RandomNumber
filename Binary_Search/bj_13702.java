package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_13702 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			
			int number = Integer.parseInt(br.readLine());
			
			arr_int.add(number);
		}
		
		long start = 1;
		long end = 0;
		
		for(int i : arr_int) {
			
			end = Math.max(end, i);
		}
		
		while(start <= end) {
			
			long mid = (start + end) / 2;
			int sum = 0;
			
			for(int i = 0; i < N; i++) {
				
				//나누어줄 수 있는 개수
				sum += arr_int.get(i) / mid;
		
			}
			
			//더 최대로 줄일 수 있는지 확인하기 위해 같을때도 줄여야된다
			if(sum >= K) {
				
				start = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
		}
		System.out.println(end);
	}
}

