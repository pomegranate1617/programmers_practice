package level0;

public class Exam43 {//중복된 숫자 개수
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,1,2,3,4,5},1));
		System.out.println(solution(new int[] {0,2,3,4},1));
	}
	public static int solution(int[] array,int n) {
		int nCnt = 0;
		
		for(int num : array) {
			if(num == n) {
				nCnt++;
			}
		}
		
		return nCnt;
	}

}
