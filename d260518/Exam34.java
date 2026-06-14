package leve1.d260518;

public class Exam34 {//삼총사
	//백트래킹,재귀함수,조합관련으로 다른 사람풀이 더 자세히 보기
	public static void main(String[] args) {
		System.out.println(solution(new int[] {0,2,3,0,2,-5}));
		System.out.println(solution(new int[] {-3,-2,-1,0,1,2,3}));
		System.out.println(solution(new int[] {-1,1,-1,1}));
	}
	
	
	public static int solution(int[] number) {
		
		int groupCnt = 0;
		
		for(int i=0;i<number.length;i++) {
			
			for(int j=i+1;j<number.length;j++) {
				
				for(int k=j+1;k<number.length;k++) {
					
					int sum = number[i] + number[j] + number[k];
					
					if(sum == 0) {
						groupCnt++;
					}
				}
			}
		}
		
		return groupCnt++;
	}
}
