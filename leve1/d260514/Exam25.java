package leve1.d260514;

import java.util.Arrays;

public class Exam25 {//문자열 내림차순으로 배치하기
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
	
	public static String solution(String s) {
		char[] split = s.toCharArray();
		
		Arrays.sort(split);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i= split.length-1;i>=0;i--) {
			sb.append(split[i]);
		}
		
		return sb.toString();
	}
}
