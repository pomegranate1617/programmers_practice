package leve1.d260601;

public class Exam54 {//덧칠하기
	public static void main(String[] args) {
		System.out.println(solution(8,4,new int[] {2,3,6}));
		System.out.println(solution(5,4,new int[] {1,3}));
		System.out.println(solution(4,1,new int[] {1,2,3,4}));
		System.out.println(solution(4,3,new int[] {3,4}));
	}
	
	public static int solution(int n,int m,int[] section) {
		//section에 포함되지 않은 구역이라도 m의 길이가 피할 수 없다면
		//칠한다,그 구역에서도 끝나지 않거나 일부만 칠해지면
		//이어서 칠하고 구역이 끝나는 부분과 롤러의 칠한 길이가 일치할 때
		//멈추기 가능
		
		//롤러를 칠한 부분안에 구역이 들어가면 됨
		//가장 마지막 구역은 롤러의 끝부분이 마지막의 경계선에 딱 맞도록 칠하기
		
		int max = section[section.length-1];
		int min = section[0];
		
		int paintingCnt = 0;
		
		for(int i=min;i<=max;i+=m) {
			paintingCnt++;
		}
		
		return paintingCnt;
	}
}
