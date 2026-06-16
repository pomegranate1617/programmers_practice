package leve1.d260515;

import java.util.ArrayList;
import java.util.List;

public class Exam31 {//최대공약수와 최소공배수
	public static void main(String[] args) {
		
		int[] arr = solution(3,12);
		
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		int[] arr2 = solution(2,5);
		
		for(int num : arr2) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		int[] arr3 = solution(6,28);
		
		for(int num : arr3) {
			System.out.println(num);
		}
		System.out.println("=======================");
	}
	
	public static int[] solution(int n,int m) {
		
		int gcd = 1;
		int lcm = 1;
		
		int max = Math.max(n,m);
		int min = Math.min(n,m);
		
		int[] arr = new int[2];
		
		if(max % min == 0) {
			
			gcd = min;
			lcm = max;
			
			arr[0] = gcd;
			arr[1] = lcm;
			
			return arr;
		}else {
			
			List<Integer> primeList = new ArrayList<>();
			//소수 찾기
			for(int i=2;i<=min;i++) {
				
				boolean isPrime = true;
				
				for(int j=2;j<i;j++) {
					
					if(i%j == 0) {
						isPrime = false;
						break;
					}
				}
				
				if(isPrime) {
					primeList.add(i);
				}
			}
			
			while(true) {
				
				if(primeList.contains(n) || primeList.contains(m)) {
					break;
				}
				
				for(int prime : primeList) {
					
					if(n%prime==0 && m%prime==0) {
						n /= prime;
						m /= prime;
						gcd *= prime;
						break;
					}
				}
				
			}
			
			lcm = gcd*n*m;
			
			arr[0] = gcd;
			arr[1] = lcm;
			
			return arr;
		}
	}

}
