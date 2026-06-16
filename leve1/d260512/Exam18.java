package leve1.d260512;

public class Exam18 {//콜라츠 추측
	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(1));
//		System.out.println(solution(9780657630L));
	}
	
	public static int solution(int num) {
		
		int circuit = 0;
		
		while(num != 1) {
			circuit++;
			
			if(num%2 == 0) {
				num /= 2;
			}else {
				num = num * 3 + 1;
			}
			
			if(circuit >= 500 && num != 1) {
				return -1;
			}
		}
		
		if(circuit == 0) {
			return 0;
		}else {
			return circuit;
		}
	}
}
