package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2792 {

	static StringTokenizer st = null;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		
		for(int i = 0; i < M; i++) {
			
			int number = Integer.parseInt(br.readLine());
			arr_int.add(number);
		}
		
		//최소 보석의 개수가 1이므로 1로 설정
		int start = 1;
		int end = 0;
		
		for(int i : arr_int) {
			
			end = Math.max(end, i);
		}
		
		while(start <= end) {
			
			int count = 0;
			int mid = (start + end) / 2;
			
			for(int i = 0; i < M; i++) {
				
				count += arr_int.get(i) / mid;
				
				//개수가 남을때 1명 추가
				if(arr_int.get(i) % mid != 0) {
					
					count += 1;
				}
			}
			
			if(count > N) {
				start = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
		}
		
		System.out.println(start);
		
	}

}
