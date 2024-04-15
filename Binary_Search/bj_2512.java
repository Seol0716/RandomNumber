package pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class bj_2512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < num; i++) {
			
			int number = sc.nextInt();
			arr_int.add(number);
		}
		
		long M = sc.nextLong();
		
		//최대값 구하기
		int max = 0;
		
		for(int i : arr_int) {
			
			max = Math.max(max, i);
		}
		
		int start = 0;
		int end = max;
		
		int answer = 0;
		
		while(start < end) {
			
			//세금
			int mid = (start + end) / 2;
			
			//총액
			long sum = 0;
			
			for(int i : arr_int) {
				
				//만약 세금을 낼 수 있으면 세금을 낸다
				if(i > mid) {
					
					sum += mid;
				}
				
				//세금을 못내면 가진돈을 낸다
				else {
					sum += i;
				}
			}
			
			//총액에 못미치니 예산을 더 올린다
			if(sum < M) {
				
				start = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
		}
		
		System.out.println(end-1);
	
	}

}
