package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_2512_Low {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < num; i++) {
			
			int number  = Integer.parseInt(st.nextToken());
			arr_int.add(number);
		}
		
		
		int K = Integer.parseInt(br.readLine());
		
        Collections.sort(arr_int);
        
        long start = 0;
		long end = arr_int.get(arr_int.size()-1);
        
		while(start < end) {
			
			long mid = (start + end) / 2;
			long sum = 0;
			
			for(int i : arr_int) {
				
				if(i > mid) {
					
					sum += mid;
				}
				
				else {
					sum += i;
				}
			}
				//upper bound 특성상
				//값을 찾아낸 후 다음 인덱스를 출력하기 때문에
				//end의 범위는 줄여주면 안된다
				if(sum > K) {
					end = mid - 1;
				}
				
				else {
					start = mid + 1;
				}
			}
			
			System.out.println(end);
		}
	}
