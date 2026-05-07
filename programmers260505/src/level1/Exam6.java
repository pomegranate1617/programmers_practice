package level1;

public class Exam6 {//정수 제곱근 판별
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}
	public static long solution(long n) {
		if(Math.sqrt(n)%1 == 0) {
			long xAdd = (long)Math.sqrt(n) + 1;
			return xAdd*xAdd;	
		}else {
			return -1;
		}
	}

}
