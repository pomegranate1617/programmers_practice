package level0;

public class Exam2 {//두수의 나눗셈 문제
	public static void main(String[] args) {
		Exam2 exam = new Exam2();
		System.out.println(exam.solution(3,4));
	}
	public int solution(int num1,int num2) {
		int answer = 0;
        double divideResult = num1/(double)num2;
        answer = (int)(divideResult*1000);
        return answer;
	}
}
