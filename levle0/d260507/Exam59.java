package levle0.d260507;

import java.util.Arrays;

public class Exam59 {//문자열 정렬하기(2)
	public static void main(String[] args) {
		System.out.println(solution("Bcad"));
		System.out.println(solution("heLLo"));
		System.out.println(solution("Python"));
	}
	public static String solution(String my_string) {
		
		StringBuilder sb = new StringBuilder("");
		
		String lowerStr = my_string.toLowerCase();
		String[] arr = lowerStr.split("");
		Arrays.sort(arr);
		
		for(String character : arr) {
			sb.append(character);
		}
		
		return sb.toString();
		//배열을 new String()의 매개값으로 줘도 됨.
	}
}
