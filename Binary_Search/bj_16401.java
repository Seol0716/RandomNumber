package pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class bj_16401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//조카의 수
		int M = sc.nextInt();
		
		//과자의 수
		int N = sc.nextInt();
		
		//과자의 길이
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			
			int number = sc.nextInt();
			
			arr_int.add(number);
		}
		
		//최대길이를 가진 과자
		int max = 0;
		
		for(int i : arr_int) {
			
			max = Math.max(max, i);
		}
		
		int start = 0;
		int end = max;
		
//		System.out.println(start + " " + end);
		
		while(start <= end){
			
			int mid = (start + end) / 2;
			int count = 0;
			
			for(int i = 0; i < N; i++) {
				
				//빠른 비교를 위하여 잘랐을때 mid보다 큰것만 계산
				if(arr_int.get(i) >= mid){
				
					//조카M명에게 나눠 줄 수 있는지 확인
					count += arr_int.get(i) / mid;
				}
			}
			
			//초과하면 줄인다
			if(count >= M) {
				
				start = mid +1;
			}
			
			//부족하면 늘임
			else {
				end = mid - 1;
			}
			
		}
		
		System.out.println(end);
	}
}
