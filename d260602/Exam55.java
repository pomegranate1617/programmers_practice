package leve1.d260602;

import java.util.Arrays;

public class Exam55 {//지폐접기
	public static void main(String[] args) {
		System.out.println(solution(new int[] {30,15},new int[] {26,17}));
		System.out.println(solution(new int[] {50,50},new int[] {100,241}));
		System.out.println(solution(new int[] {15,30},new int[] {240,100}));
	}
	public static int solution(int[] wallet,int[] bill) {
		//지폐 접을 때 길이가 긴쪽을 반으로 접는다.
		//지갑에 넣을 때 회전시키기 가능
		
		//항상 배열을 긴쪽을 두번째 원소로 오게 정렬[짧은쪽,긴쪽]
		Arrays.sort(wallet);
		Arrays.sort(bill);
		
		int[] transBill = Arrays.copyOf(bill,bill.length);
		int transCnt = 0;
		
		while(wallet[0]<transBill[0] || wallet[1]<transBill[1]) {
			
			transBill[1] /= 2;
			transCnt++;
			
			if(transBill[1]<transBill[0]) {
				Arrays.sort(transBill);
			}	
		}
		
		return transCnt;
		
	}

}
