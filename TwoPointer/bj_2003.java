package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_2003 {

	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [] arr_int = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			arr_int[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int start = 0;
		int end = 0;
		int count = 0;
		int length = arr_int.length;
		
		int sum = 0;
		
		while(end <= N) {
		
			 if(sum == M) {
					count++;
				}
			 
			if(sum <= M) {
				
				sum += arr_int[end++];
			}
			
			else  {
				sum -= arr_int[start++];
			}
		}
		
		System.out.println(count);
	}
}
