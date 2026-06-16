package leve1.d260511;

import java.util.ArrayList;
import java.util.List;

public class Exam15 {//없는 숫자 더하기
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,6,7,8,0}));
		System.out.println(solution(new int[] {5,8,4,0,6,7,9}));
	}
	
	public static int solution(int[] numbers) {
		
		List<Integer> numbersList = new ArrayList<>();
		
		for(int num : numbers) {
			numbersList.add(num);
		}
		
		int notFindSum = 0;
		
		for(int i=0;i<10;i++) {
			if(!numbersList.contains(i)) {
				notFindSum += i;
			}
		}
		
		return notFindSum;
	}

}
