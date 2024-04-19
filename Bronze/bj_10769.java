package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj_10769 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);

		String str = br.readLine();
		
		int happy = 0;
		int sad = 0;
		
		for(int i = 0; i < str.length()-3; i++) {
			
			//행복한 이모티콘일때
			if(str.charAt(i) == ':' && str.charAt( i +1) == '-' && str.charAt(i+ 2) == ')') {
				
				happy++;
			}
			
			//슬픈 표정일때
			else if(str.charAt(i) == ':' && str.charAt(i + 1) == '-' && str.charAt(i + 2) == '(') {
				
				sad++;
			}
		}
		
		if(happy > sad) System.out.print("happy");
		
		else if(happy < sad) System.out.print("sad");
		
		else if(happy == 0 && sad == 0) System.out.print("none");
		
		else if(happy == sad) System.out.print("unsure");
		
	}

}
