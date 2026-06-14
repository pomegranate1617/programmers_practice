package leve1.d260512;

public class Exam18Re {//콜라츠 추측
	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
//		System.out.println(solution(1));

//		System.out.println(solution(9780657630L));
	}
	
	public static int solution(long num) {
		
		int circuit = 0;
		
		while(num != 1) {
			circuit++;
			
			if(num%2 == 0) {
				num /= 2;
			}else {
				num = num * 3 + 1;
			}
			
			if(circuit == 500) {
				circuit = -1;
				break;
			}
		}
		
		return circuit;
		
	}
}
