package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//명령 프롬프트
public class bj_1032 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		//-1 해줘야 인덱스over이 안남
		String [] arr_str = new String[num];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < num; i++) {
			
			arr_str[i] = br.readLine();
			
		}
		
		
		//입력받은 문자열의 길이는 다 같으므로 for문 i는 문자열의 길이만큼 돌린다
		for(int i =0; i < arr_str[0].length(); i++) {
			
			char ch = arr_str[0].charAt(i);
			Boolean b = true;
			
			
			
			//두번째 문자열부터 마지막 문자열 길이까지 돌린다 
			for(int j = 1; j < num; j++) {
				
				
			
				if(ch != arr_str[j].charAt(i)) {
					b = false;
				}
			
				System.out.println(b + "1");
			}
			
			
			
				if(b) {
					sb.append(ch);
					System.out.println(sb.toString());
				}
				else {
					sb.append("?");
				}
				
			
		}
		
//		System.out.print(sb.toString());
		
		
		
	
	}

}
