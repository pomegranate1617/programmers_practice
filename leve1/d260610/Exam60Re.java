//package leve1.d260610;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Exam60Re {//실패율
//	public static void main(String[] args) {
//		
//	}
//	
//	public static int[] solution(int n,int[] stages) {
//		Map<Integer,Integer> passMap = new HashMap<>();
//		Map<Integer,Integer> challengeMap = new HashMap<>();
//		
//		for(int i = 1; i <= n; i++) {
//			passMap.put(i, 0);
//			challengeMap.put(i,0);
//		}
//		
//		for(int i = 0;i < stages.length; i++) {
//			int passStage = stages[i] - 1;
//			int challengeStage = stages[i];
//			
//			for(int j = 1; j <= challengeStage; j++) {
//				
//				if(j < challengeStage) {
//					int increase = passMap.get(j) + 1;
//					passMap.replace(j, increase);
//				}
//				
//				if(j == challengeStage) {
//					int increase2 = challengeMap.get(j) + 1;
//					challengeMap.replace(j,increase2);
//				}
//			}
//		}
//		
//		
//		
//		
//	}
//
//}
