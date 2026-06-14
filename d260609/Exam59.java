package leve1.d260609;

import java.util.ArrayList;
import java.util.List;

public class Exam59 {//소수 만들기//재귀함수로 푼 다른 사람 풀이 보기
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {1,2,7,6,4}));
	}
	
	public static int solution(int[] nums) {

		List<Integer> addList = new ArrayList<>();
		
		int maxNum = 0;
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				
				for(int k=j+1;k<nums.length;k++) {
					
					int sumNum = nums[i] + nums[j]+ nums[k];
					
					addList.add(sumNum);
					
					if(sumNum>maxNum) {
						maxNum = sumNum;
					}
				} 
			}
		}
		
		boolean[] notPrime = new boolean[maxNum+1];
		
		for(int i=2;i<notPrime.length;i++) {
			for(int j=i*i; j<notPrime.length; j+=i) {
				notPrime[j] = true;
			}
		}
		
		int factorCnt = 0;
		
		for(int num : addList) {
			if(notPrime[num] == false) {
				factorCnt++;
			}
		}
		
		return factorCnt;
		
	}

}
