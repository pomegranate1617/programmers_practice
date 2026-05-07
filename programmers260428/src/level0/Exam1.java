package level0;

public class Exam1 {//두 수의 곱 구하기문제
	public static void main(String[] args) {
		Exam1 exam = new Exam1(); 
		int result = exam.solution(1,2);
		System.out.println(result);
	}
	public int solution(int num1,int num2) {
		int answer = 0;
		answer = num1*num2;
		return answer;
	}
}
