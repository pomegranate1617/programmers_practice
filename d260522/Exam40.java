package leve1.d260522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam40 {//두 개 뽑아서 더하기//다른 사람 코드보기
	public static void main(String[] args) {
		int[] arr = solution(new int[] {2,1,3,4,1});
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = solution(new int[] {5,0,2,7});
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = solution(new int[] {0,0});
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = solution(new int[] {1,1,1,1});
		System.out.println(Arrays.toString(arr4));
	}
	
	public static int[] solution(int[] numbers) {
		
		List<Integer> sumList = new ArrayList<>();
		
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=i+1;j<numbers.length;j++) {
				
				int sum = numbers[i] +  numbers[j];
				
				if(!sumList.contains(sum)) {
					sumList.add(sum);
				}
			}
		}
		
		int[] sumArr = new int[sumList.size()];
		
		for(int i=0;i<sumList.size();i++) {
			sumArr[i] = sumList.get(i);
		}
		
		Arrays.sort(sumArr);
		
		return sumArr;	
	}
}
