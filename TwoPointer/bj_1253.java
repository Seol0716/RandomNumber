package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_1253 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
		
			int number = Integer.parseInt(st.nextToken());
			arr_int.add(number);
		}
		
		//투포인터를 사용하기 위해
		//정렬해준다
		Collections.sort(arr_int);
		
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
		
			int start = 0;
			int end = arr_int.size()-1;
			
			while(true) {
			
				
				//인덱스가 같더라도 계속 찾으면서 비교
				
				if(start == i) start++;
				else if(end == i) end--;
			
				//인덱스 초과 오류 날 수 있으므로
				//start가 end의 범위를 넘어가면 종료
				//더해서 값이 안나오기 때문 
				if(start >= end) {
					break;
				}
				
				//두 수 합해서 나온지는 비교
				if(arr_int.get(start) + arr_int.get(end) == arr_int.get(i)) {					
					
					count++;
					start++;
					end--;
					break;
					
				}
				
				else if(arr_int.get(start) + arr_int.get(end) < arr_int.get(i)) {
					
					start++;
				}
				
				//같을때 비교는 else로 설정해줘야됨
				//다음 값 비교
				else {
					end--;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
