package leve1.d260520;

public class Exam35Re7 {//이상한 문자 만들기
	public static void main(String[] args0) {
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
	}
	
	public static String solution(String s) {
		
		StringBuilder sentenceSb = new StringBuilder(s);
		String[] words = s.split(" ");
		
//		for(String word : words) {
//			System.out.println(word);
//		}
		
//		for(String word : words) {
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			
			StringBuilder wordSb = new StringBuilder();
			
			if(!word.equals(" ")) {
				
				for(int j=0;j<word.length();j++) {
					
					String character = word.substring(j,j+1);
					
					if(j == 0) {
						wordSb.append(character.toUpperCase());
					}else if(j%2 == 0) {
						wordSb.append(character.toUpperCase());
					}else {
						wordSb.append(character.toLowerCase());
					}
				}
				
				String transWord = wordSb.toString();
				
				
				//s.indexOf(word)는 문자열의 변환이 없으므로 항상 같은 인덱스반환
				int startIdx = sentenceSb.indexOf(word);
				int endIdx = startIdx + word.length();
				
				sentenceSb.replace(startIdx,endIdx,transWord);
//				System.out.println(sentenceSb.toString());
			}

		}
		
		return sentenceSb.toString();
	}

}
