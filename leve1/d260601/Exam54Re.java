package leve1.d260601;

import java.util.PriorityQueue;

public class Exam54Re {//덧칠하기
	public static void main(String[] args) {
		System.out.println(solution(8,4,new int[] {2,3,6}));
		System.out.println(solution(5,4,new int[] {1,3}));
		System.out.println(solution(4,1,new int[] {1,2,3,4}));
		System.out.println(solution(4,3,new int[] {3,4}));
		System.out.println(solution(4,4,new int[] {2}));
//		System.out.println(solution(7,));
	}
	
	public static int solution(int n,int m,int[] section) {
		//section에 포함되지 않은 구역이라도 m의 길이가 피할 수 없다면
		//칠한다,그 구역에서도 끝나지 않거나 일부만 칠해지면
		//이어서 칠하고 구역이 끝나는 부분과 롤러의 칠한 길이가 일치할 때
		//멈추기 가능
		
		//롤러를 칠한 부분안에 구역이 들어가면 됨
		//가장 마지막 구역은 롤러의 끝부분이 마지막의 경계선에 딱 맞도록 칠하기
		
		//첫번째 구역을 칠한 후 그 다음에 칠해야 할 구역확인
		//다음구역의 경우 이미 칠해졌는지,안칠해져 있다면 다음 구역에서 벽의 맨 끝길이까지
		//길이가 롤러의 길이보다 넘지 않는지 확인
	
		//롤러가 지나는 범위가 벽의 범위 내에 있을것
		//롤러를 칠하는 횟수가 최소일것
		
		//모든 경우에서 시작점과 롤러의 길이를 더한값이 벽의 총길이를 넘지 못하도록한다
		//만약 롤러의 길이가 주어진 구역의 시작점보다 길경우 시작점보다 좀 앞당겨서 칠한다.
		
		int wallLength = section.length - 1;
//		int max = section[wallLength];
//		int min = section[0];
		
		int paintingCnt = 0;
		
		//칠해야 할 구역이 롤러의 맨왼쪽,중간,오른쪽에 오느냐를 구분
		//칠해야 할 구역의 오른쪽 영역에 남은 구역이 롤러보다 길이가 짧으면 안됨
		//롤러의 맨 왼쪽 시작점 위치를 잡는것이 중요포인트
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
//			int leftSide = paintSection - 1;
//			int rigthSid = n - paintSection;
			//왼쪽 공간이 부족할 때 =>오른쪽으로 치우치게 칠함
			//오른쪽 공간이 부족할 때 => 왼쪽으로 치우치게 칠함
			//두 공간 모두 충분할 때 =>시작점을 페인트칠 필요한 구역에서 시작
			rollerStartPoint = paintSection;
			rollerEndPoint = paintSection + m;
			
			
			if(paintSection + m > n) {
				while(rollerEndPoint > n) {
					rollerStartPoint--;
					rollerEndPoint--;
				}
			}
			
			for(int i=rollerStartPoint ;i<=rollerEndPoint;i++) {
				
				if(wantPaint.contains(i)) {
					wantPaint.poll();
				}
			}
//			if(paintSection + m <= n) {
//				
//				for(int i=rollerStartPoint ;i<=rollerEndPoint;i++) {
//					
//					if(wantPaint.contains(i)) {
//						wantPaint.poll();
//					}
//				}
//			}else {
//				while(rollerEndPoint > n) {
//					rollerStartPoint--;
//					rollerEndPoint--;
//				}
//			}
			
			paintingCnt++;
		}
		return paintingCnt;
	}
}
