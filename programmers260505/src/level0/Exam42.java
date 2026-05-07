package level0;

public class Exam42 {//문자열의 뒤의 n글자
	public static void main(String[] args) {
		System.out.println(solution("ProgrammerS123",11));
		System.out.println(solution("He110W0r1d",5));
	}
	public static String solution(String my_string,int n) {
		String lastStr = my_string.substring(my_string.length()-n);
		return lastStr;
	}
}
