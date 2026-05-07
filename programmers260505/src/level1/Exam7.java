package level1;

public class Exam7 {//짝수와 홀수
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	public static String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}
}
