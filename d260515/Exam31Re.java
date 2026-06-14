package leve1.d260515;

import java.util.ArrayList;
import java.util.List;

public class Exam31Re {//최대공약수와 최소공배수
	public static void main(String[] args) {
		//한 수가 다른 수의 배수(약수)
		long[] arr = solution(3,12);
		
		for(long num : arr) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		
		long[] arr2 = solution(2,5);
		
		for(long num : arr2) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		
		
		long[] arr3 = solution(6,28);
		
		for(long num : arr3) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		
		
		long[] arr4 = solution(1,28);
		
		for(long num : arr4) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		
		
		long[] arr5 = solution(1,1);
		
		for(long num : arr5) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		
		//같은 수
		long[] arr6 = solution(13,13);
		
		for(long num : arr6) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		
		long[] arr7 = solution(999999,1000000);
		
		for(long num : arr7) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		//둘 다 소수
		long[] arr8 = solution(13,5);
		
		for(long num : arr8) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		//한쪽만 소수
		long[] arr9 = solution(3,16);
		
		for(long num : arr9) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		//한쪽만 소수
		long[] arr10 = solution(16,3);
		for(long num : arr10) {
			System.out.println(num);
		}
		System.out.println("=======================");
	}
	
	public static long[] solution(int n,int m) {
		long gcd = 1;
		long lcm = 1;
		
		int max = Math.max(n,m);
		int min = Math.min(n,m);
		
		long[] arr = new long[2];
		
		if(max % min == 0) {
			
			gcd = min;
			lcm = max;
			
		}else {
			
			List<Integer> factorList = new ArrayList<>();
			
			//i의 범위를 를 Math.sqrt(min)미만에서 min미만으로 수정함..
			for(int i=2;i<min;i++) {
				if(min%i==0) {
					factorList.add(i);
				}
			}
			
			while(true) {
				
				boolean isBreak = false;
				
				for(int factor : factorList) {
					
					if(n%factor == 0 && m%factor == 0) {
						
						m /= factor;
						n /= factor;
						
						gcd *= factor;
						isBreak = true;
						break;
					}
				}
				
				if(!isBreak) break;
			}
			
			lcm = gcd*n*m;
			
		}
		
		arr[0] = gcd;
		arr[1] = lcm;
		
		return arr;
	}
	//다른 사람 풀이 확인하기
}
