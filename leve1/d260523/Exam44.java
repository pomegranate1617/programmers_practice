package leve1.d260523;

public class Exam44 {//콜라 문제
	public static void main(String[] args) {
		System.out.println(solution(2,1,20));
		System.out.println(solution(3,1,20));
		System.out.println(solution(4,2,10));
		System.out.println(solution(5,4,5));
		System.out.println(solution(2,1,2));
		System.out.println(solution(3,2,500));
	}
	
	public static int solution(int a,int b,int n) {
		
		
		int sumCola = 0;
		
		
		while(n>=a) {
			
			int modBottle = 0;
			
			if(n%a != 0) {
				modBottle += n%a;
			}
			
			n = n / a * b; 
			
			sumCola += n;
			
			n += modBottle;
		}
		
		return sumCola;
	}

}
