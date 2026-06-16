package leve1.d260525;

import java.util.Arrays;

public class Exam45 {//명예의 전당(1)
	public static void main(String[] args) {
		int[] arr = solution(3,new int[] {10,100,20,150,1,100,200});
		System.out.println(Arrays.toString(arr));
		System.out.println("==========================");
		
		
		int[] arr2 = solution(4,new int[] {0,300,40,300,20,70,150,50,500,1000});
		System.out.println(Arrays.toString(arr2));
		System.out.println("==========================");
		
		int[] arr3 = solution(3,new int[] {0,0,0,0,0,0,30});
		System.out.println(Arrays.toString(arr3));
	}
	
	public static int[] solution(int k,int[] score) {
		//하루가 지날 때 마다 score배열의 값을 읽는 길이가 증가
		//k일 이전에는 들어간 값 중 가장 최저값만 반환
		//k일이 지나면 일부 가수의 점수들만 랭크에 올라가고 그 중 최하점만 반환
		//반환되는 배열은 각 일차의 랭크 최하점을 담은 배열
		//score배열의 길이는 프로그램이 진행된 일 수와 같음
		
		
		int broadcastPeriod = score.length;//방영 일수
		int[] rank = new int[k];
		int[] floorRankScore = new int[broadcastPeriod];
		//-1로 초기화(점수가 0도 들어갈 수 있으므로)
		for(int i=0;i<k;i++) {
			rank[i] = -1;
		}
		
		int day = 1;
		
		while(day<=broadcastPeriod) {
			
			if(day > k) {
				//lank의 최하위값보다 
				//socre의 점수가 클 경우 lank값 교체
				if(rank[k-1]<score[day-1]) {
					rank[k-1] = score[day-1];
				}
				
			}else {
				rank[day-1] = score[day-1];
			}
			
			//내림차순 정렬
			for(int i=0;i<k;i++) {
				
				for(int j=i+1;j<k;j++) {
					
					if(rank[i]<rank[j]) {
						
						int box = rank[i];
						rank[i] = rank[j];
						rank[j] = box;
					}
				}
			}
			
			
			if(day<k) {
				floorRankScore[day-1] = rank[day-1];
			}else {
				floorRankScore[day-1] = rank[k-1];
			}
			day++;
		}
		return floorRankScore;
	}

}
