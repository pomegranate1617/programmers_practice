package leve1.d260519;

import java.util.StringTokenizer;

public class Exam35Re2 {//이상한 문자 만들기
	public static void main(String[] args) {
		System.out.println(solution("try hello"));
		System.out.println(solution("world"));
		System.out.println(solution("a                cdef"));
	}
	
	public static String solution(String s) {
		StringTokenizer st = new StringTokenizer(s," ");
		
		StringBuilder sb = new StringBuilder();
		
		int totalTokenCnt = st.countTokens();
		int tokenCnt = 0;
		
		while(st.hasMoreTokens()) {
			
			String word = st.nextToken();
			tokenCnt++;
			
			for(int i=0;i<word.length();i++) {
				
				
				String Character = word.substring(i,i+1);
				
				if(i == 0) {
					sb.append(Character.toUpperCase());
				}else {
					
					if(i%2 == 0) {
						sb.append(Character.toUpperCase());
					}else {
						sb.append(Character.toLowerCase());
					}
				}
			}
			
			if(tokenCnt != totalTokenCnt) {
				sb.append(" ");
			}
			
		}
		
		return sb.toString();
	}
	
}
