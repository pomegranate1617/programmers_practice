package levle0.d260508;

public class Exam67 {//문자열 정수의 합
	public static void main(String[] args) {
		System.out.println(solution("123456789"));
		System.out.println(solution("1000000"));
	}
	public static int solution(String num_str) {
		
		int digitSum = 0;
		
		for(int i=0;i<num_str.length();i++) {
			digitSum += Integer.parseInt(num_str.charAt(i) + "");
		}
		
		return digitSum;
	}

}
