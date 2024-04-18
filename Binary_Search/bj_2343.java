package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2343 {
	
	static StringTokenizer st;
	static ArrayList<Integer> arr_int;
	static int N;
	static int M;
	static int start;
	static int end;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//N,M 입력
		st = new StringTokenizer(br.readLine());
		
		 N = Integer.parseInt(st.nextToken());
		
	     M = Integer.parseInt(st.nextToken());
		
		arr_int = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int number = Integer.parseInt(st.nextToken());
			
			arr_int.add(number);
		}
		
	}
	
	public static int Binary() {
		
		int start = arr_int.size();
		int end = 0;
		
		System.out.println(start);
		
		for(int i : arr_int) {
			
			end += i;
		}
		
		while(start <= end) {
			int sum = 0;
			int count = 0;
			int mid = (start + end) / 2;
			
			for(int i = 0; i < N; i++) {
				
			//미드 값으로 값을 합쳐 3개를 만들 수 있는지 판별
			//mid값보다 초과를 한다면 전 인덱스까지 저장
			if(sum + arr_int.get(i) > mid) {
				
				count++;
				sum = 0;
			}
			
			sum += arr_int.get(i);
			
			//못 만들면 사이즈를 줄임
			if(count < M) {
				end = mid - 1;
			}
			
			else {
				start = mid + 1;
			}
			}
		}
		
		return start;		
	}
}
