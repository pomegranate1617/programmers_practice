package leve1.d260518;

import java.util.Arrays;

public class Exam33 {//예산
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,2,5,4},9));
		System.out.println(solution(new int[] {2,2,3,3},10));
		System.out.println(solution(new int[] {1,1,2,1,1},4));
		System.out.println(solution(new int[] {1},2));
		System.out.println(solution(new int[] {4},3));
	}
	public static int solution(int[] d,int budget) {
		
		int acceptCnt = 0;
		
		Arrays.sort(d);
		
		for(int depart : d) {
			if(budget-depart>=0) {
				budget -= depart;
				acceptCnt++;//정렬했으므로 <0이 되는 순간 break해도 됨
			}
		}
		
		return acceptCnt;
	}

}
