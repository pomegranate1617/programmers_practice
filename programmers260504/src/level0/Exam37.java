package level0;

public class Exam37 {//제곱수 판별하기
	public static void main(String[] args) {
		System.out.println(solution(144));
		System.out.println(solution(976));
	}
	public static int solution(int n) {
		double sqrt = Math.sqrt(n);
		
		if(sqrt%1 == 0) {
			return 1;
		}else {
			return 2;
		}
	}

}
