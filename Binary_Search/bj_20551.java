package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class bj_20551 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//이분탐색 Low_bounds로 찾을려고 했지만
		//탐색불가
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String [] arr_str = br.readLine().split(" ");
//		int N = Integer.parseInt(arr_str[0]);
//		int M= Integer.parseInt(arr_str[1]);
//		
//		ArrayList<Integer> arr_int = new ArrayList<Integer>();
//		
//		for(int i = 0; i < N; i++) {
//			
//			int number = Integer.parseInt(br.readLine());
//			arr_int.add(number);
//		}
//		
//		Collections.sort(arr_int);
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i < M; i++) {
//			
//			int number = Integer.parseInt(br.readLine());
//			
//			int rs = binary(number, arr_int);
//			
//			if(rs >= 0) {
//				
//				sb.append(rs).append("\n");
//			}
//			
//			else {
//				
//				sb.append("-1").append("\n");
//			}
//		}
//		
//		System.out.println(sb);
//	}
//	
//	public static int binary(int key, ArrayList<Integer> arr_int){
//		
//		int start = 0;
//		int end = arr_int.size();
//		
//		while(start < end) {
//			
//			int mid = (start + end) / 2;
//			
//			if(key > arr_int.get(mid)) {
//				start = mid + 1;
//			}
//			
//			
//			else if(key == arr_int.get(mid)) {
//				
//				return mid;
//			}
//			else {
//				
//				end = mid;
//			}
//			
//		}
//		return -1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			int number = Integer.parseInt(br.readLine());
			arr_int.add(number);
		}
		
		Collections.sort(arr_int);
		
		//값, 인덱스
				Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//데이터 넣기
		for(int i = 0; i < N; i++) {
			
			if(!map.containsKey(arr_int.get(i))){
				
				map.put(arr_int.get(i), i);
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		
		//
		for(int j = 0; j < M; j++) {
			int number = Integer.parseInt(br.readLine());
		
			if(map.containsKey(number)) {
				
				sb.append(map.get(number)).append("\n");
			}
			
			else {
				sb.append("-1").append("\n");
			}
		}
		System.out.println(sb);
}
}