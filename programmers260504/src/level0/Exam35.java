package level0;

public class Exam35 {//자릿수 더하기
	public static void main(String[] args) {
		System.out.println(solution(1234));
		System.out.println(solution(930211));
	}
	public static int solution(int n) {
		String[] stN = String.valueOf(n).split("");
		
		int sum = 0;
		
		for(String num : stN) {
			sum += Integer.parseInt(num);
		}
		
		return sum;
	}
}
