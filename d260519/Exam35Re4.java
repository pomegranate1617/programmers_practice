package leve1.d260519;

import java.util.StringTokenizer;

public class Exam35Re4 {//이상한 문자 만들기
	public static void main(String[] args) {
		System.out.println(solution("abc  c  "));
	}
	
	public static String solution(String s) {
		
		StringBuilder sentenceSb = new StringBuilder(s);
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		while(st.hasMoreTokens()) {
			
			StringBuilder wordSb = new StringBuilder();
			
			String word = st.nextToken();
			
			for(int i=0;i<word.length();i++) {
				
				String character = word.substring(i,i+1);
				
				if(i == 0) {
					wordSb.append(character.toUpperCase());
				}else if(i%2 == 0) {
					wordSb.append(character.toUpperCase());
				}else {
					wordSb.append(character.toLowerCase());
				}
			}
			
			String transWord = wordSb.toString();
			
			int startIdx = s.indexOf(word);
			int endIdx = startIdx + transWord.length();
			
			sentenceSb.replace(startIdx,endIdx-1, transWord);
			System.out.println(sentenceSb.toString());
			wordSb.delete(startIdx,endIdx);
			System.out.println(wordSb.toString());
		}
		System.out.println(sentenceSb.toString());
		return sentenceSb.toString();
	}

}
