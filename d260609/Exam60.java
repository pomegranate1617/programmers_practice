//package leve1.d260609;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Exam60 {//실패율
//	public static void main(String[] args) {
//		
//	}
//	
//	public static int[] solution(int n,int[] stages) {
//		//해당 스테이지 불통과시 해당 스테이지가 멈춰있는 스테이지 번호
//		//모두 클리어 n+1에서 멈춤
//		//실패율이 높은 순서(내림차순)으로 정렬
//		//스테이지 실패율이 동일한 경우 오름차순 정렬
//		//도달 유저 없는 경우 실패율 0
//		//실패율 = 클리어 x플레이어 수 / 스테이지 도달한 플레이어수
//		//스테이지 도달한 플레이어 = stages원소에서 -1을 뺀값이 해당스테이지 이상인
//		//경우의 인원수
//		
//		//해당 번호에 멈춰있을 경우 클리어x플레이어로 집계
//		//도전 중 이후 레벨의 경우는 도달한 플레이어로 집계x
//		int[] passStage = new int[n+1];
//		int[] challengeStage = new int[n+1];
//		
//		for(int stopStage : stages) {
//			
//			for(int i=1;i<passStage.length;i++) {
//				
//				if(i<=stopStage) {
//					passStage[i]++;
//				}
//				
//				if(i==stopStage) {
//					challengeStage[i]++;
//				}
//			}
//		}
//		
//		Map<Integer,Double> stagefailPercent = new HashMap<>();
//		
//		for(int i=1;i<passStage.length;i++) {
//			stagefailPercent.put(i, challengeStage[i] / (double)passStage[i]);
//		}
//		
//		int[] stageSort = new int[n];
////		for(int i=1;i<stage)
////		double[] failPercentage = new double[n+1];
////		
////		for(int i=1;i<failPercentage.length;i++) {
////			
////			if(challengeStage[i] != 0) {
////				failPercentage[i] = failStage[i] / (double)challengeStage[i];
////			}else {
////				failPercentage[i] = 0;
////			}
////		}
//		
////		int[] descSortStage = new int[n];
////		
////		for(int i=1;i<failPercentage.length;i++) {
////			for(int j=i+1;j<failPercentage.length;j++) {
////				if(failPercentage[i]<=failPercentage[j]) {
////						double temp = failPercentage[i];
////						failPercentage[i] = failPercentage[j];
////						failPercentage[j] = temp;
////				}
////			}
////		}
//		
//		
//		
//		
//		
//		
//	}
//
//}
