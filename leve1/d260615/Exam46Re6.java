package leve1.d260615;

import java.util.Arrays;

public class Exam46Re6 {//문자열 내 마음대로 정렬
	public static void main(String[] args) {
		
	}
	
	public static String[] solution(String[] strings, int n) {
		//각 문자열의 n인덱스에 있는 문자열로 오름차순 정렬
		//동일시 사전순 정렬(오름차순)
		String[] sortArr = Arrays.copyOf(strings, strings.length);
		
		Arrays.asList(sortArr).stream().sorted((s1,s2) ->{
			return s1.substring(n).compareTo(s2.substring(n));
		}).map(s -> (String)s).toArray();
	}

}
