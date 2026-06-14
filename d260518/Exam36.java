package leve1.d260518;

public class Exam36 {//3진법 뒤집기
	public static void main(String[] args) {
		System.out.println(solution(45));
		System.out.println(solution(125));
		System.out.println(solution(99999999));
	}
	
	public static long solution(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		while(n != 0) {
			sb.append(n%3);
			n /= 3;
		}
		
		//sb.reverse().reverse().toString()
		String reverseTernery = sb.toString();
		long decimal = 0;
		
		int circuit = reverseTernery.length()-1;
		
		for(int i=0;i<reverseTernery.length();i++) {
			
			int digit = Integer.parseInt(reverseTernery.substring(i,i+1));
			
			for(int j= circuit;j>0;j--) {
				digit *= 3;
			}
			
			circuit--;
			decimal += digit;
			
		}
		
		return decimal;
		
	}
}
