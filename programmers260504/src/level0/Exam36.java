package level0;

public class Exam36 {//문자열 안에 문자열
	public static void main(String[] args) {
		System.out.println(solution("ab6CDE443fgh22iJKlmn1o","6CD"));
		System.out.println(solution("ppprrrogrammers","pppp"));
		System.out.println(solution("AbcAbcA","AAA"));
	}
	public static int solution(String str1,String str2) {
		if(str1.contains(str2)) {
			return 1;
		}else {
			return 2;
		}
	}
}
