package pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bj_3273 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < num; i++) {
			
			int number = sc.nextInt();
			
			arr_int.add(number);
		}
		
		Collections.sort(arr_int);
		
		int x = sc.nextInt();
		
		int count = 0;
		int start = 0;
		int end = num-1;
		
		while(start < end) {
			
			int sum = arr_int.get(start) + arr_int.get(end);
			
			if(sum == x) {
				count++;
			}
			
			if(sum < x) {
				
				start++;
			}
			
			else {
				end--;
			}
		}
		
		System.out.println(count);
	}

}
