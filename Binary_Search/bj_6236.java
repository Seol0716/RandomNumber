package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_6236 {

	static StringTokenizer st = null;
	static ArrayList<Integer> arr_int = null;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
	
		
		arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			
			int number = Integer.parseInt(br.readLine());
			
			arr_int.add(number);
		}
		
//		for(int i : arr_int) {
//			
//			System.out.println(i);
//		}
		
		//최소
		int min = 0;
		int max = 1000000000;
		
		for(int i : arr_int) {
			
			min = Math.max(min, i);
			
		}
		
		System.out.println(binary(min,max,N,M));
	}
	
	public static int binary(int min,int max,int N, int M) {
		
		int start = min;
		int end = max;
		
		
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			int count = 1;
			int money = mid;
			for(int i = 0; i < N; i++) {
				
				if(money - arr_int.get(i)< 0) {
					
					money = mid;
					count += 1;
				}
				
				money -= arr_int.get(i);
				
			}
			
			if(count > M) {
				
				start = mid + 1;
			}
			
			else {
				end = mid  - 1;
			}
			}
		
		return start;
	}
}
