package leve1.d260512;

import java.util.Arrays;

public class Exam16 {//나누어 떨어지는 숫자 배열
	public static void main(String[] args) {
		int[] arr = solution(new int[] {5,9,7,10},5);
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("=========================");
		int[] arr2 = solution(new int[] {2,36,1,3},1);
		for(int num2 : arr2) {
			System.out.println(num2);;
		}
		System.out.println("============================");
		int[] arr3 = solution(new int[] {3,2,6},10);
		for(int num3 : arr3) {
			System.out.println(num3);
		}
	}
	
	public static int[] solution(int[] arr,int divisor) {
		
		Arrays.sort(arr);
		int modZero = 0;
		
		for(int num : arr) {
			
			if(num % divisor == 0) {
				modZero++;
			}
		}
		
		if(modZero == 0) {
			return new int[] {-1};
		}else {
			
			int[] newArr = new int[modZero];
			int idx = 0;
			
			for(int num : arr) {
				
				if(num%divisor == 0) {
					
					newArr[idx] = num;
					idx++;
				}
			}
			
			return newArr;
		}
			
	}

}
