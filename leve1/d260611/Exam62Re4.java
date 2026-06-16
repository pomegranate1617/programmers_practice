package leve1.d260611;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exam62Re4 {//실패율
	public static void main(String[] args) {
		
	}
	
	public static int[] solution(int n,int[] stages) {
		//도달했으나 클리어x => stages[i]
		//클리어o => stages[i] - 1
		//실패율 = 도달만 한 사람들 / (클리어한 사람들 + 도달만 한 사람들)
		//아무도 도달x =>실패율 = 0
		//실패율 내림차순으로 스테이지 번호 배열 리턴(실패율 같은경우 스테이지 번호로 오름차순 정렬)
		int[] clearCnt = new int[n+1];
		int[] reachCnt = new int[n+1];
		
		for(int i = 0; i <= stages.length; i++) {
			
			int eachClearStages = stages[i] - 1;
			int eachReachStages = stages[i];
			
			for(int j = 1; j <= n; j++) {
				
				if(j < eachReachStages) {
					clearCnt[j]++;
				}
				
				if(j == eachReachStages && j != n+1) {
					reachCnt[j]++;
				}
			}
		}
		
		Map<Integer,Double> failPercentMap = new HashMap<>();
		
		for(int i = 1; i <= n; i++) {
			
			double failPercent = (double)reachCnt[i] / (reachCnt[i] + clearCnt[i]);
			failPercentMap.put(i, failPercent);
		}
		
		Set<Map.Entry<Integer,Double>> entrySet = failPercentMap.entrySet();
		
		entrySet.mapToInt(entry -> entry.getValue()).sorted((value1,value2) -> {
			if(value1 > value2) return -1;
			else if(value1 == value2) return 0;
			else return 1;
		}).
		
		
	}

}
