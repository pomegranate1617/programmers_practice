package leve1.d260605;

public class Exam58 {//소수 찾기
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
		System.out.println(solution(2));
	}
	
	public static int solution(int n) {
		
		int primeNumCnt = 0;
		
		for(int i=2;i<=n;i++) {
			
			boolean isFactor = false;
			
			for(int j=2;j<Math.sqrt(i);j++) {
				
				if(i%j == 0) {
					isFactor = true;
					break;
				}
			}
			
			if(!isFactor) {
				primeNumCnt++;
			}
		}
		
		return primeNumCnt;
	}

}
