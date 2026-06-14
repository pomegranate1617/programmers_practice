package leve1.d260520;

import java.util.StringTokenizer;

public class Exam35Re5 {//이상한 문자 만들기
	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
		System.out.println(solution("world"));
		System.out.println(solution("a"));
		System.out.println(solution("a   Bcd"));
		System.out.println(solution("a! bcd3a"));
		System.out.println(solution("a                cdef"));
		System.out.println(solution("abc   c   "));
		System.out.println(solution(" abc de f  "));
		System.out.println(solution("    "));
		System.out.println(solution(" abcde"));
		System.out.println(solution("00000  00"));
	}
	
	public static String solution(String s) {
		
		StringBuilder sentenceSb = new StringBuilder(s);
		
		StringTokenizer st = new StringTokenizer(s," ");
//		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			
			StringBuilder wordSb = new StringBuilder();
			String word = st.nextToken();
			
			for(int i=0;i<word.length();i++) {
				
				String character = word.substring(i,i+1);
				
				if(i == 0) {
					wordSb.append(character.toUpperCase());
				}else {
					if(i%2 == 0) {
						wordSb.append(character.toUpperCase());
					}else {
						wordSb.append(character.toLowerCase());
					}
				}
			}
			
			String transWord = wordSb.toString();
			
			int startIdx = s.indexOf(word);
			int endIdx = startIdx + transWord.length();
			
			sentenceSb.replace(startIdx,endIdx, transWord);
		}
//		System.out.println(sentenceSb.toString());
		return sentenceSb.toString();
	}

}
