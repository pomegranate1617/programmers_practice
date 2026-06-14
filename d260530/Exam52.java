package leve1.d260530;

import java.util.Arrays;

public class Exam52 {//모의고사
	public static void main(String[] args) {
		int[] arr = solution(new int[] {1,2,3,4,5});
		System.out.println(Arrays.toString(arr));
		System.out.println("======================");
		
		int[] arr2 = solution(new int[] {1,3,2,4,2});
		System.out.println(Arrays.toString(arr2));
		System.out.println("======================");
	}
	
	public static int[] solution(int[] answers) {
		//1번 12345반복
		//2번 21232425반복
		//3번 3311224455반복
		
		int[] firstRepeat = {1,2,3,4,5};
		int[] secondRepeat = {2,1,2,3,2,4,2,5};
		int[] thirdRepeat = {3,3,1,1,2,2,4,4,5,5};
		
		int firstIdx = 0;
		int secondIdx = 0;
		int thirdIdx = 0;
		
		int[] correctCnt = new int[3];
		
		for(int i=0;i<answers.length;i++) {
			
			int answer = answers[i];
			
			if(firstRepeat[firstIdx++] == answer) {
				correctCnt[0]++;
			}
			if(secondRepeat[secondIdx++] == answer) {
				correctCnt[1]++;
			}
			if(thirdRepeat[thirdIdx++] == answer) {
				correctCnt[2]++;
			}
			
			
			if(firstIdx == firstRepeat.length) {
				firstIdx = 0;
			}
			if(secondIdx == secondRepeat.length) {
				secondIdx = 0;
			}
			if(thirdIdx == thirdRepeat.length) {
				thirdIdx = 0;
			}
		}
		
		int maxScore = correctCnt[0];
		
		for(int cnt : correctCnt) {
			
			if(maxScore<cnt) {
				maxScore = cnt;
			}
		}
		
		int maxEqualCnt = 0;
		
		for(int cnt : correctCnt) {
			if(maxScore == cnt) {
				maxEqualCnt++;
			}
		}
		
		int[] maxScorePerson = new int[maxEqualCnt];
		int idx = 0;
		
		for(int i=0;i<correctCnt.length;i++) {
			if(maxScore == correctCnt[i]) {
				maxScorePerson[idx++] = i+1;
			}
		}
		
		return maxScorePerson;
		
		
	}
}
