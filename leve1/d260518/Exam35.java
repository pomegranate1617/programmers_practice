package leve1.d260518;

public class Exam35 {//이상한 문자 만들기
	public static void main(String[] args) {
//		System.out.println(solution("try hello"));
//		System.out.println(solution("world"));
//		System.out.println(solution("a"));
//		System.out.println(solution("a   Bcd"));
//		System.out.println(solution("a! bcd3a"));
		System.out.println(solution("a              des"));
	}
	
	public static String solution(String s) {//하나 '이상'의 공백문자
		String[] words = s.split(" ");
//		System.out.println(words.length);
		for(String word : words) {
			System.out.println(word);
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<words.length;i++){
			
			for(int j=0;j<words[i].length();j++) {
				
				char character  = words[i].charAt(j);
				
				String charStr = String.valueOf(character);
				
				if((character>='a' && character<='z') || (character>='A' && character<='Z')) {
					
					if(j == 0) {
						sb.append(charStr.toUpperCase());
					}else {
						
						if(j%2 == 0) {
							sb.append(charStr.toUpperCase());
						}else {
							sb.append(charStr.toLowerCase());
						}
					}
				}else {
					sb.append(charStr);
				}
			}
			
			
			if(i != words.length-1) {
				sb.append(" ");
			}
		}
		return sb.toString();	
		
	}

}
