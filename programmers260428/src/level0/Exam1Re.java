package level0;

public class Exam1Re {
	public static void main(String[] args) {
		Exam1 exam = new Exam1(); 
		int result = exam.solution(1,2);
		System.out.println(result);
	}
	public int solution(int num1,int num2) {
        int answer = 0;
        while(true){
             if(num1>=0 && num1<=100 && num2>=0 && num2<=100){
	            answer = num1*num2;
	            return answer;
             }
        } 
	}
}
