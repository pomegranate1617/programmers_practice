package level1;

public class Exam2 {//약수의 합
	public static void main(String[] args) {
		System.out.println(solution(12));
	}
	public static int solution(int n) {
		int divisorSum = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				divisorSum += i;
			}
		}
		return divisorSum;
	}
	
}
