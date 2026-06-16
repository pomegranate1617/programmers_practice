package leve1.d260519;

public class Exam35Re3 {//이상한 문자 만들기
	public static void main(String[] args) {
		System.out.println(solution("try hello"));
		System.out.println(solution("world"));
		System.out.println(solution("a"));
		System.out.println(solution("a   Bcd"));
		System.out.println(solution("a! bcd3a"));
		System.out.println(solution("a    des"));
		//테스트 케이스 힌트 봄↓
		System.out.print(solution("a       des     "));
	}
	
	public static String solution(String s) {//하나 '이상'의 공백문자
		String[] words = s.split(" ");
//		for(String word : words) {
//			System.out.println(word);
//		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			
			for(int j=0;j<word.length();j++) {
				
				char character = word.charAt(j);
				
				if(j == 0) {
					sb.append((character+ "").toUpperCase());
				}else if(j%2 == 0){
					sb.append((character+ "").toUpperCase());
				}else {
					sb.append((character+ "").toLowerCase());
				}	
			}
			if(i != words.length-1) {
				sb.append(" ");
			}

		}
		return sb.toString();
	
	}
}
