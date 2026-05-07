package level0;

public class Exam27 {//숨어있는 숫자의 덧셈(1)
	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOP"));
		System.out.println(solution("1a2b3c4d123"));
	}
	public static int solution(String my_string) {
		int myLength = my_string.length();
		int numSum = 0;
		for(int i=0;i<myLength;i++) {
			char splitChar = my_string.charAt(i);
			if(splitChar>='0' && splitChar<='9') {
				numSum += Integer.parseInt(splitChar + "");
			}
		}
		return numSum;
	}
}
