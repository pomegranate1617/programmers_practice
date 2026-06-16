package levle0.d260506;

import java.util.Arrays;

public class Exam52 {//문자열 정렬하기(1)
	public static void main(String[] args) {
		
		int[] arr = solution("hi12392");
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("=============");
		
		int[] arr2 = solution("p2o4i8gj2");
		for(int num : arr2) {
			System.out.println(num);
		}
		System.out.println("=============");
		
		int[] arr3 = solution("abcde0");
		for(int num : arr3) {
			System.out.println(num);
		}
		System.out.println("=============");
	}
	
	
	public static int[] solution(String my_string) {
		
		int arrLength = 0;
		
		for(int i=0;i<my_string.length();i++) {
			
			char splitChar = my_string.charAt(i);
			
			if(splitChar>='0' && splitChar<='9') {
				arrLength++;
			}
			
		}
		
		
		int[] arr = new int[arrLength];
		int idx = 0;
		
		for(int i=0;i<my_string.length();i++) {
			
			char splitChar2 = my_string.charAt(i);
			
			if(splitChar2>='0' && splitChar2<='9') {
				arr[idx] = Integer.parseInt(splitChar2 + "");
				idx++;
			}
			
		}
		
		Arrays.sort(arr);
		
		return arr;
		
		
	}
}
