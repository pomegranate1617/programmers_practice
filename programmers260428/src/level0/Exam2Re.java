package level0;

public class Exam2Re {
public static void main(String[] args) {
		Exam2Re exam = new Exam2Re();
		int result = exam.solution(3, 4);
		System.out.println(result);
	}
	public int solution(int num1, int num2) {
	    while(true){
	        boolean conditionCheck = num1>0 && num1<=100 && num2>0 && num2<=100;
	        int answer = 0;
	        if(conditionCheck){
	            double divideResult = num1/(double)num2;
	            answer = (int)(divideResult*1000);
	        }
	        return answer;
    }
    
}
}
