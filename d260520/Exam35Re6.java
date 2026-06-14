package leve1.d260520;

import java.util.StringTokenizer;

public class Exam35Re6 {//이상한 문자 만들기
	public static void main(String[] args) {

	}
	
	public static String solution(String s) {
		StringBuilder sentenceSb = new StringBuilder(s);
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		while(st.hasMoreTokens()) {
			
			StringBuilder wordSb = new StringBuilder();
			
			String word = st.nextToken();
			
			for(int i=0;i<word.length();i++) {
				
				char character = word.charAt(i);
				
				if((character>='A' && character<='Z') || (character>='a' && character<='z')) {
					
					if(i == 0) {
						wordSb.append((character + "").toUpperCase());
					}else if(i%2 == 0) {
						wordSb.append((character + "").toUpperCase());
					}else {
						wordSb.append((character + "").toLowerCase());
					}
				}else {
					wordSb.append(character);
				}
				
			}
			
			String transWord = wordSb.toString();
			
			int startIdx = s.indexOf(word);
			int endIdx = startIdx + transWord.length();
			
			sentenceSb.replace(startIdx,endIdx, transWord);
		}
		System.out.println(sentenceSb.toString());
		return sentenceSb.toString();
	}

}
