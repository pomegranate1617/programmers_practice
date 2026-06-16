package leve1.d260608;

public class Exam58Re {//소수 찾기
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
		System.out.println(solution(2));
		System.out.println(solution(1));
		System.out.println(solution(3));
	}
	
	public static int solution(int n) {
		
		int primeNumCnt = 0;
		
		for(int i=2;i<=n;i++) {
			
			boolean isFactor = false;
			//j<Math.sqrt(i)해버리면 루트25일때 약수 5가 포함이 안되어
			//소수의 갯수가 증가함
			for(int j=2;j<=Math.sqrt(i);j++) {
				
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
