package pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class bj_2805 {

	static ArrayList<Integer> arr_int = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			
			int number = sc.nextInt();
			
			arr_int.add(number);
		}
		
		int max = 0;
		
		for(int i : arr_int) {
		
			max = Math.max(max, i);
		}
		
		System.out.println(binary(M,max));
		
	}

	public static long binary(int M, int max) {
		
		int start = 0;
		int end = max + 1;
		
		while(start < end) {
			
			int mid = (start + end) / 2;
			long sum = 0;
			
			for(int i : arr_int) {
				
				//절단한 나무의 길이를 저장
				if(i - mid > 0) {
					
					sum += i - mid;
				}
			}
			
			if(sum < M) {
				
				end = mid;
			}
			
			else {
				start = mid + 1;
			}
			
		}
		
		return start-1;
	}
}
