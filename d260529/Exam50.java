package leve1.d260529;

import java.util.HashSet;
import java.util.Set;

public class Exam50 {//폰켓몬
	public static void main(String[] args) {
		int[] arr = {3,1,2,3};
		System.out.println(solution(arr));
		System.out.println("==========================");
		
		int[] arr2 = {3,3,3,2,2,4};
		System.out.println(solution(arr2));
		System.out.println("==========================");
		
		int[] arr3 = {3,3,3,2,2,2};
		System.out.println(solution(arr3));
		System.out.println("==========================");
		
		int[] arr4 = {1,1};
		System.out.println(solution(arr4));
		System.out.println("==========================");
		
		int[] arr5 = {2,2,2,2,2,2};
		System.out.println(solution(arr5));
		System.out.println("==========================");
		
		int[] arr6 = {1,1,1,1,2,1};
		System.out.println(solution(arr6));
		System.out.println("==========================");
	}
	
	public static int solution(int[] nums) {
		
		Set<Integer> kindSet = new HashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			kindSet.add(nums[i]);
		}
		
		int kindCnt = kindSet.size();
		int choice = nums.length / 2;
		
		if(kindCnt >= choice) {
			return choice;
		}else {
			return kindCnt;
		}
	}

}
