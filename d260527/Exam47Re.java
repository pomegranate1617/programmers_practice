package leve1.d260527;

public class Exam47Re {//카드 뭉치
	public static void main(String[] args) {
		String[]  cards1 = {"i","drink","water"};
		String[] cards2 = {"want","to"};
		String[] goal = {"i","want","to","drink","water"};
		System.out.println(solution(cards1,cards2,goal));
		System.out.println("==============================");
		
		String[]  cards3 = {"i","water","drink"};
		String[] cards4 = {"want","to"};
		String[] goal2 = {"i","want","to","drink","water"};
		System.out.println(solution(cards3,cards4,goal2));
	}
	
	public static String solution(String[] cards1,String[] cards2,String[] goal) {
		
		int cards1Idx = 0;
		int cards2Idx = 0;
		
		boolean success = true;
		
		boolean idxOut1 = false;
		boolean idxOut2 = false;
		
		for(int i=0;i<goal.length;i++) {
			
			if(cards1Idx >= cards1.length) idxOut1 = true;
			if(cards2Idx >= cards2.length) idxOut2 = true;
			
			String word = goal[i];
			
			//cards1Idx의 인덱스를 먼저 계산해버리면 IndexOutBound되므로
			//idxOut먼저 판단해서 false판정나게 해야 함.
			if(idxOut1 == false && cards1[cards1Idx].equals(word)) {
				
				cards1Idx++;
				continue;
			}
			
	
			if(idxOut2 == false && cards2[cards2Idx].equals(word)) {
				
				cards2Idx++;
			}else {
				
				success = false;
				break;
			}		
		}
		
		if(success) {
			return "Yes";
		}else {
			return "No";
		}
		
	}

}
