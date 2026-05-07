package level1;

public class Exam3 {//자릿수 더하기
	public static void main(String[] args) {
		System.out.println(solution(123));
	}
	public static int solution(int n) {
		int digitTotal = 0;
		String num = n + "";
		for(int i=0;i<num.length();i++) {
			digitTotal += Integer.parseInt(num.charAt(i)+ "");
		}
		return digitTotal;
	}
}
