package leve1.d260601;

import java.util.PriorityQueue;

public class Exam54Re2 {//덧칠하기
	public static void main(String[] args) {
		System.out.println(solution(8,4,new int[] {2,3,6}));
		System.out.println(solution(5,4,new int[] {1,3}));
		System.out.println(solution(4,1,new int[] {1,2,3,4}));
		System.out.println(solution(4,3,new int[] {3,4}));
		System.out.println(solution(4,4,new int[] {2}));
//		System.out.println(solution(7,));
	}
	
	public static int solution(int n,int m,int[] section) {
		
//		int wallLength = section.length - 1;
		
		int paintingCnt = 0;
		
		PriorityQueue<Integer> wantPaint = new PriorityQueue<>();
		
		for(int sectionNum : section) {
			wantPaint.offer(sectionNum);
		}
		
		//페인팅 시작점 결정
		//조건1)페인트칠이 필요한 구역의 왼쪽에 남는 구역길이
		//조건2)페인트칠이 필요한 구역의 오른쪽에 남는 구역길이
		//조건3)롤러의 길이 내에서 페인트칠이 필요한 다른 구역 포함가능하다면 최대한 포함가능하게
		int rollerStartPoint = 0;
		int rollerEndPoint = 0;
		
		while(!wantPaint.isEmpty()) {
			
			int paintSection = wantPaint.peek();
			
			//왼쪽 공간이 부족할 때 =>오른쪽으로 치우치게 칠함
			//오른쪽 공간이 부족할 때 => 왼쪽으로 치우치게 칠함
			//두 공간 모두 충분할 때 =>시작점을 페인트칠 필요한 구역에서 시작
			rollerStartPoint = paintSection;
			rollerEndPoint = paintSection + m - 1;
			
			
			while(rollerEndPoint > n) {
				rollerStartPoint--;
				rollerEndPoint--;
			}
			
			for(int i=rollerStartPoint ;i<=rollerEndPoint;i++) {
				
				if(wantPaint.contains(i)) {
					wantPaint.poll();
				}
			}
			
			paintingCnt++;
		}
		return paintingCnt;
	}
}
