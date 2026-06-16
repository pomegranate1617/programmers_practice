//package leve1.d260611;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class Exam62Re3 {//실패율
//	public static void main(String[] args) {
//		
//	}
//	
//	public static int[] solution(int n,int[] stages) {
//		//도달했으나 클리어x => stages[i]
//		//클리어o => stages[i] - 1
//		//실패율 = 도달만 한 사람들 / (클리어한 사람들 + 도달만 한 사람들)
//		//아무도 도달x =>실패율 = 0
//		//실패율 내림차순으로 스테이지 번호 배열 리턴(실패율 같은경우 스테이지 번호로 오름차순 정렬)
//		Map<Integer,String> failPercentMap = new HashMap<>();
//		
//		for(int i = 1;i <= n+1; i++) {
//			failPercentMap.put(i,"0/0");
//		}
//		
//		for(int i = 0; i < stages.length; i++) {
//			
//			int clear = stages[i] - 1;
//			int reach = stages[i];
//			
//			for(int j = 1; j <= reach; j++) {
//				
//				String[] failPercent = failPercentMap.get(j).split("/");
//				
//				if(j <= clear) {
//					failPercentMap.put(j,(Integer.parseInt(failPercent[0]) + 1) + "/" + Integer.parseInt(failPercent[1]));
//				}
//				if(j == reach) {
//					failPercentMap.put(j,Integer.parseInt(failPercent[0]) + "/" + (Integer.parseInt(failPercent[1]) + 1));
//				}
//			}
//		}
//		
//		Set<Map.Entry<Integer,String>> failEntrySet = failPercentMap.entrySet();
//		
//		failEntrySet.stream().map(entry -> entry.getKey()).sorted((o1,o2) ->{
//			if(o1 < o2) return -1;
//			else if(o1 == o2) return 0;
//			return 1;
//		}).toArray();
//		
//		failEntrySet.stream().map(entry -> entry.getValue()).sorted((o1,o2) -> {
//			if(o1 > o2) return -1;
//			else if(o1 == o2) return 0;
//			return 1;
//		}).toArray();
//	}
//
//}
