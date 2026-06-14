package leve1.d260528;

import java.util.Arrays;

public class Exam48 {//[1차]비밀지도
	public static void main(String[] args) {//다른 사람 코드 보기
		int n = 5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		String[] answer = solution(n,arr1,arr2);
		
		System.out.println(Arrays.toString(answer));
		
		System.out.println("==============================");
		
		int n2 = 6;
		int[] arr3 = {46,33,33,22,31,50};
		int[] arr4 = {27,56,19,14,14,10};
		
		String[] answer2 = solution(n2,arr3,arr4);
		
		System.out.println(Arrays.toString(answer2));
		
		System.out.println("=============================");
		
		int n3 = 4;
		int[] arr5 = {0b1111,0b0000,0b1111,0b0000};
		int[] arr6 = {0b1111,0b0000,0b1111,0b0000};
		
		String[] answer3 = solution(n3,arr5,arr6);
		
		System.out.println(Arrays.toString(answer3));
		
		System.out.println("=============================");
		
		int n4 = 4;
		int[] arr7 = {0,0,0,0};
		int[] arr8 = {0,0,0,0};
		
		String[] answer4 = solution(n4,arr7,arr8);
		
		System.out.println(Arrays.toString(answer4));
		
		System.out.println("=============================");
		
		int n5 = 4;
		int[] arr9 = {0,0,0,0};
		int[] arr10 = {1,0,1,0};
		
		String[] answer5 = solution(n5,arr9,arr10);
		
		System.out.println(Arrays.toString(answer5));
		
		System.out.println("=============================");
		
		
	}
	public static String[] solution(int n,int[] arr1,int[] arr2) {
		//자릿수 부족시 왼쪽에 0(공백)으로 채움
		int[] binary = new int[n];
		

		for(int i=0;i<arr1.length;i++) {
			
			int combineNum = arr1[i] | arr2[i];
			binary[i] = combineNum;
		}
			
		String[] decodeMap = new String[n];
			
		for(int i=0;i<binary.length;i++) {
			
			StringBuilder sb = new StringBuilder();
			
			int num = binary[i];

			while(num > 0) {
				
				if(num%2 == 1) {
					
					num /= 2;
					sb.append("#");
				}else {
	
					num /= 2;
					sb.append(" ");
				}
			}
			
			sb.reverse();
			
			//for문 안에 n-sb.length()계산식을 넣으면 n-sb.length()가
			//반복적으로 갱신되어 범위가 계속변함
			//인덱스는 증가하는데 범위가 줄어 반복이 필요한 부분에서 반복실행이 불가능해짐
//			if(n>sb.length()) {
//				for(int j=0;j<n-sb.length();j++) {
//					sb.insert(0," ");
//				}
//			}
			if(n>sb.length()) {
				
				int cnt = n-sb.length();
				
				while(cnt>0) {
					sb.insert(0," ");
					cnt--;
				}
			}
			
			decodeMap[i] = sb.toString();
		}
			
			
		
		return decodeMap;
		
	}
}
