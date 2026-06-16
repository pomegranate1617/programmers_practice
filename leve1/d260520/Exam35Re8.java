package leve1.d260520;

import java.util.StringTokenizer;

public class Exam35Re8 {//이상한 문자 만들기
	public static void main(String[] args) {
		
		System.out.println(solution("try hello world"));
		System.out.println(solution("world"));
		System.out.println(solution("a"));
		System.out.println(solution("a   Bcd"));
		System.out.println(solution("a! bcd3a"));
		System.out.println(solution("a                cdef"));
		System.out.println(solution("abc   c   "));
		//힌트에서 가져온 테스트 케이스
		System.out.println(solution(" abc de f  "));
		
		System.out.println(solution("    "));
		System.out.println(solution(" abcde"));
		System.out.println(solution("00000  00"));
		//챗지피티한테 테스트케이스 받아옴...
		System.out.println(solution("abc abc"));
		
		System.out.println(solution("a a a a"));
		System.out.println(solution("aaa aaa aaa    aaa"));
		//정답 맞힌후(Re9) 테스트케이스 추가(챗지피티)
		System.out.println(solution("ab abAB ab"));
	}
	
	public static String solution(String s) {
		StringBuilder sentenceSb = new StringBuilder(s);
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		while(st.hasMoreTokens()) {
			
			StringBuilder wordSb = new StringBuilder();
			
			String word = st.nextToken();
			
			for(int i=0;i<word.length();i++) {
				
				char character = word.charAt(i);
				
				if(i == 0) {
					wordSb.append(String.valueOf(character).toUpperCase());
				}else if(i%2 == 0) {
					wordSb.append(String.valueOf(character).toUpperCase());
				}else {
					wordSb.append(String.valueOf(character).toLowerCase());
				}	
			}
			
			String transWord = wordSb.toString();
			
//			String sentence = sentenceSb.toString();
//			int startIdx = sentence.indexOf(word);
			
			int startIdx = sentenceSb.indexOf(word);
			int endIdx = startIdx + transWord.length();
			
			sentenceSb.replace(startIdx,endIdx,transWord);
		}
		
		return sentenceSb.toString();
	}

}
