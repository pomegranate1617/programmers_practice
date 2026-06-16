package leve1.d260521;

import java.util.Arrays;

public class Exam37 {//최소직사각형
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{60,50},{30,70},{60,30},{80,40}}));
		System.out.println(solution(new int[][] {{10,7},{12,3},{8,15},{14,7},{5,15}}));
		System.out.println(solution(new int[][] {{14,4},{19,6},{6,16},{18,7},{7,11}}));
		System.out.println(solution(new int[][] {{1,2}}));
		System.out.println(solution(new int[][] {{1000,1000}}));
	}
	public static int solution(int[][] sizes) {
		//명함에서 길이가 긴쪽과 짧은쪽을 각각 비교할 수 있게
		//가로와 세로의 길이의 순서를 바꾼다.(가로:큰 수 세로: 작은 수)
		//긴쪽의 최댓값과 작은 쪽의 최댓값의 곱이 최소 지갑 크기
		int cardCnt = sizes.length;
		
		int[] longSide = new int[cardCnt];
		int[] shortSide = new int[cardCnt];
		
		for(int i=0;i<cardCnt;i++) {
			
			int width = sizes[i][0];
			int height = sizes[i][1];
			
			//Math.max와 Math.min사용해도 괜찮을거 같음.
			if(width > height) {
				
				longSide[i] = width;
				shortSide[i] = height;
			}else {
				
				longSide[i] = height;
				shortSide[i] = width;
			}
		}
		
		Arrays.sort(longSide);
		Arrays.sort(shortSide);
		
		return longSide[cardCnt - 1] * shortSide[cardCnt - 1];
		
	}
}
