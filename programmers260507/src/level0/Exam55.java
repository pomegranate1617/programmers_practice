package levle0.d260507;

public class Exam55 {//369게임
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(29423));
		System.out.println(solution(2));
	}
	public static int solution(int order) {
		
		int clap = 0;
		
		while(order != 0) {
			
			int digit = order%10;
			order /= 10;
			
			if(digit == 3 || digit == 6 || digit == 9) {
				clap++;
			}
			
		}
		
		return clap;
	}
}
