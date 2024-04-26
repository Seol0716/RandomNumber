package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_14627 {

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
		
	
		//최소개수의 범위가1이기때문
		long start = 1;
		long end = 0;
		long max = 0;
		for(int i : arr_int) {
			
			end = Math.max(end, i);
			max += i;
		}
				
		while(start <= end) {
			
			long mid = (start + end) / 2;
			int  sum = 0;
			
			for(int i = 0; i < N; i++) {
				
				sum += arr_int.get(i) / mid;
			}
			
			if(sum >= K) {
				
				start = mid +1;
			}
			
			else {
				end = mid - 1;
			}
			
			System.out.println(start + " " + "1");
			System.out.println(end + " " + "2");
			System.out.println(mid + " " + "3");
		}
		
	
		long result = max - ( end * K);
		
		System.out.println(result);
	}
}
