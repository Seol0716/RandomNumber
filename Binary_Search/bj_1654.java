package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class bj_1654 {

	static ArrayList<Integer> arr_int = null;
	static int n = 0;
	static int k = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] arr_str = br.readLine().split(" ");
		
		n = Integer.parseInt(arr_str[0]);
		k = Integer.parseInt(arr_str[1]);
		
		arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			
			int number = Integer.parseInt(br.readLine());
			
			arr_int.add(number);
		}
		
		//가장 긴 길이의 N 구하기
		long max = 0;
		
		for(int i = 0; i < n; i++) {
			
			max = Math.max(max, arr_int.get(i));
		}
		 
		System.out.println(binary(max));
	}
	
	public static long binary(long max) {
		
		long start = 0;
		long end = max + 1;
		while(start < end) {
			
			long mid = (start + end) / 2;
			long sum = 0;
			
			//미드 값에 따라 총 몇 개가 만들어지는지 구한다.
			//Upper bounds 방식
			//mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
			//자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다
			//그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다
			
			for(int i = 0; i < n; i++) {
				
				sum += (arr_int.get(i) / mid);
			}
			
			if(sum < k) {
				
				end = mid;
			}
			
			else {
				start = mid + 1;
			}
		}
		return start-1;
	}
}
