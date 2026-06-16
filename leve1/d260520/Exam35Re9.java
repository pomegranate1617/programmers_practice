package leve1.d260520;//정답코드이긴 함

public class Exam35Re9 {//이상한 문자 만들기
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
		//테스트케이스 추가(챗지피티)
		System.out.println(solution("ab abAB ab"));
	}
	
	public static String solution(String s) {//하나 '이상'의 공백문자
		//split은 공백으로 나뉜뒤에 맨끝에 오는 문자열이 공백으로 이루어진문자열일 
		//경우 그 부분은 제거하고 배열에 저장
		//두번째 매개변수로 -1을 제공하면 끝에 온 공백으로 이루어진 문자열들도
		//배열에 저장
		String[] words = s.split(" ",-1);
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
