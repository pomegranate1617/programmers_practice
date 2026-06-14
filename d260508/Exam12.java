package leve1.d260508;

public class Exam12 {//두 정수 사이의 합
	public static void main(String[] args) {
		System.out.println(solution(3,5));
		System.out.println(solution(3,3));
		System.out.println(solution(5,3));
	}
	public static long solution(int a,int b) {
		
		int max = (a >= b) ? a : b;
		int min = (a <= b) ? a : b;
		
		long sum = 0;
		
		for(int i= min;i<=max ;i++) {
			sum += i;
		}
		
		return sum;
	}

}
