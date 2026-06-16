package leve1.d260514;

public class Exam27 {//문자열 다루기 기본
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
		System.out.println(solution("Ap34Od2e4"));
	}
	
	public static boolean solution(String s) {
		if(s.length()==4 || s.length()==6) {
			char[] strSplit = s.toCharArray();
			
			boolean isChar = false;
			
			for(char character : strSplit) {
				
				if(character <'0'|| character>'9') {
					isChar = true;
					break;
				}
			}
			
			return isChar ? false : true;
			
		}else {
			return false;
		}
		
	}
}
