package level0;

public class Exam3 {//숫자 비교하기 문제
	public static void main(String[] args) {
		Exam3 exam = new Exam3();
		System.out.println(exam.solution(3, 4));
	}
	public int solution(int num1, int num2) {
		if(num1 == num2){
            return 1;
        }else{
            return -1;
        }
    }
}
