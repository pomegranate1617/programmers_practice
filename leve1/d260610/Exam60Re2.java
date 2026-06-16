package leve1.d260610;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Exam60Re2 {//실패율
	public static void main(String[] args) {
		int[] arr = solution(5,new int[] {2,1,2,6,2,4,3,3});
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------");
		int[] arr2 = solution(4,new int[] {4,4,4,4,4,});
		System.out.println(Arrays.toString(arr2));
	}
	
	public static int[] solution(int n,int[] stages) {
		int[] passStage = new int[n+1];
		int[] challengeStage = new int[n+1];
		
		
		for(int i = 0;i < stages.length; i++) {
			
			int eachChallenge = stages[i];
			
			for(int j = 1; j <= eachChallenge; j++) {
				
				if(j<eachChallenge) {
					passStage[j]++;
				}
				
				if(j == eachChallenge && j < n+1) {
					challengeStage[j]++;
				}
			}
		}
		
		Map<Double,Integer> failPercentPair = new TreeMap<>();
		
		for(int i = 1; i < failPercentPair.size(); i++) {
			double failPercent =  challengeStage[i] / (double)(passStage[i] + challengeStage[i]);
			failPercentPair.put(failPercent,i);
		}
		
		Collection<Integer> stagesCollection = failPercentPair.values();
		
		return stagesCollection.stream().mapToInt(num -> {int a = num; 
															return a;}).toArray();
			
	}

}
