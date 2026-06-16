package leve1.d260602;

import java.util.Arrays;

public class Exam56 {//과일 장수
	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = {1,2,3,1,2,3,1};
		System.out.println(solution(k,m,score));
		System.out.println("==============================");
		
		int k2 = 4;
		int m2 = 3;
		int[] score2 = {4,1,2,2,4,4,4,4,1,2,4,2};
		System.out.println(solution(k2,m2,score2));
		System.out.println("==========================");
		
		int k3 = 3;
		int m3 = 4;
		int[] score3 = {1,3,3,2,2,3,3,1};
		System.out.println(solution(k3,m3,score3));
		System.out.println("===========================");
		//상자에 들어가는 최대점수 사과가 4를 넘지 않게 =>최고점 넘는 사과는 없음.
//		int k4 = 4;
//		int m4 = 3;
//		int[] score4 = {1,3,5,2,4,2,2,3,3,1,3};
//		System.out.println(solution(k4,m4,score4));
	}
	
	public static int solution(int k,int m,int[] score) {
		//판매가 = 한 상자 내에서 가장 최저점의 사과점수 * 한상자안의 사과갯수
		//높은 수익을 얻고 싶다면 한 박스 안의 사과 점수의 편차가 크지 않고
		//가장 최저점인 사과의 점수가 높아야 한다.
		//오름차순 정렬 후 갚이 높은 사과순부터 포장
		Arrays.sort(score);
		
		int maxProfit = 0;
		int nextBoxIdx = score.length - 1;
		
//주어진 사과에서 최고점을 받은 사과보다 높은 점수를 받는 사과는 없음
//		while(score[nextBoxIdx]>k) {
//			nextBoxIdx--;
//		}
		
		
		while(nextBoxIdx >= m - 1) {
			
			int minInBox = score[nextBoxIdx - (m - 1)];
			maxProfit += (minInBox * m);
			nextBoxIdx -= m;
		}
		
		return maxProfit;
		
	}

}
