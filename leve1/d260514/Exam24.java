package leve1.d260514;

public class Exam24 {//약수의 개수와 덧셈
	public static void main(String[] args) {
		System.out.println(solution(13,17));
		System.out.println(solution(24,27));
		System.out.println(solution(25,25));
	}
	
	public static int solution(int left,int right) {
		int sum = 0;
		
		for(int i=left;i<=right;i++) {
			
			int factorCnt = 0;
			
			for(int j=1;j<=Math.sqrt(i);j++) {
				
				if(i%j==0) {
					if(j*j == i) {
						factorCnt++;
					}else {
						factorCnt += 2;
					}
				}
			}
			
			
			if(factorCnt%2 == 0) {
				sum += i;
			}else {
				sum -= i;
			}
		}
		
		return sum;
	}
}
