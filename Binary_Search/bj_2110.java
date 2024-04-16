package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_2110 {

	static StringTokenizer st = null;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int C = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
		
			int number = Integer.parseInt(br.readLine());
			
			arr_int.add(number);
		}
		
		Collections.sort(arr_int);
		
		int start = 0;
		
		int index = arr_int.size()-1;
		int end = arr_int.get(index);
		int count = 1;
		
		while(start < end) {
			
			int mid = (start + end) / 2;
			
			//첫번 째 위치는 무조건 공유기 놓는다
			int locations = 0;
			
		    for(int i = 1; i < N; i++) {
		    	
		    	if(arr_int.get(i) - arr_int.get(locations) >= mid) {
		    		
		    		count++;
		    		locations = i;
		    	}
		    }
		    
		    
		    if(count < C) {
		    	
		    	end = mid -1;
		    	continue;
		    }
		    
		    else {
		    	start = mid + 1;
		    }
		}
		
		System.out.println(start);
	}
}
