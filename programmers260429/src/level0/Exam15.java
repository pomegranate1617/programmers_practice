package level0;

public class Exam15 {//뒤집힌 문자열
	public static void main(String[] args) {
		System.out.println(solution("jaron"));
	}
	public static  String solution(String my_string) {
		StringBuilder sb = new StringBuilder(my_string);
		return sb.reverse().toString();
	}
}
