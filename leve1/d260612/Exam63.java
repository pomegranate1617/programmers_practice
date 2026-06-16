package leve1.d260612;

public class Exam63 {//둘만의 암호
	public static void main(String[] args) {
		System.out.println(solution("aukks","wbqd",5));
//		System.out.println(solution("z","a",1));
//		System.out.println(solution("abc","bcd",1));
	}
	public static String solution(String s, String skip, int index) {
		
		//charAt로 s문자열에서 문자 분리
		//skip에 해당 문자가 있는지 contains로 확인
		//있으면 해당 글자 뛰어넘기
		StringBuilder sb = new StringBuilder(s);
		
		for(int i = 0; i < s.length(); i++) {
			
			char sChar = s.charAt(i);
			char newChar = (char)(sChar + index);
			
			while(true) {
				
				
				boolean isOverRange = newChar > 'z';
				
				if(isOverRange) {
					newChar = (char)(newChar - 'z' + 'a' - 1);
				}
				
				boolean isSkip = skip.contains(newChar  + "");
				
				if(isSkip) {
					newChar++;
				}
				
				if(!isOverRange && !isSkip) {
					break;
				}
			}
			
			sb.setCharAt(i, newChar);
		}
		
		return sb.toString();
		
	}

}
