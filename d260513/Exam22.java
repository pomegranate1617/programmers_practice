package leve1.d260513;

public class Exam22 {//가운데 글자 가져오기
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
		System.out.println(solution("123456"));
		System.out.println(solution("123"));
	}
	
	public static String solution(String s) {
		
		int length = s.length();
		
		if(length%2 == 0) {
			return s.substring(length/2 - 1,length/2 + 1);
		}else {
			return s.substring(length/2,length/2 + 1);
		}
	}
}
