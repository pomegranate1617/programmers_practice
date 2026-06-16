package leve1.d260527;

import java.util.Arrays;

public class Exam47 {//카드 뭉치
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"i","drink","water"},new String[] {"want","to"},new String[] {"i","want","to","drink","water"}));
		System.out.println("==============================");
		String[]  cards1 = {"i","water","drink"};
		String[] cards2 = {"want","to"};
		String[] goal = {"i","want","to","drink","water"};
		System.out.println(solution(cards1,cards2,goal));
	}
	
	public static String solution(String[] cards1,String[] cards2,String[] goal) {
		//한 번 사용한 카드는 다시 사용불가,카드를 뽑은 순서대로 사용
		//앞인덱스로 이동불가, 인덱스 뛰어넘기 불가
		//단, 두 카드뭉치를 섞어 만들 때는 각 뭉치의 순서를 지키며 중간중간
		//끼워넣기 가능
		int[] elementLocation = new int[goal.length];
		int eleIdx = 0;
			
		for(int i=0;i<goal.length;i++) {
			
			boolean find1 = false;
			boolean find2 = false;
			
			String word = goal[i];
			
			for(int j=0;j<cards1.length;j++) {
				
				if(cards1[j].equals(word)) {
					
					find1 = true;
					elementLocation[eleIdx++] = Integer.parseInt("1" + j);
					i++;
				}
			}
			
			if(find1) continue;
			
			for(int j=0;j<cards2.length;j++) {
				
				if(cards1[j].equals(word)) {
					
					find2 = true;
					elementLocation[eleIdx] = Integer.parseInt("2" + j);
					i++;
				}
			}
			
			eleIdx++;
			
		}
		
		Arrays.sort(elementLocation);
		
		int prevNum = elementLocation[0];
		
		boolean success = true; 
		
		for(int i=1;i<elementLocation.length;i++) {
			
			if(elementLocation[i] != prevNum+1) {
				
				if(prevNum/10 == elementLocation[i]/10) {
					
					success = false;
					break;
				}
			}
		}
		
		if(success) {
			return "Yes";
		}else {
			return "No";
		}
		
		
	}

}
