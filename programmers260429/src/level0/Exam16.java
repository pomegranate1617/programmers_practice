package level0;

public class Exam16 {//짝수 홀수 개수
	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		solution(num_list);
	}
	public static int[] solution(int[] num_list) {
		//짝수와 홀수의 개수를 담은 배열
		//evenCnt,oddCnt
		//int[] result
		
		int evenCnt = 0;
		int oddCnt = 0;
		
		for(int num : num_list) {
			if(num%2 ==0) {
				evenCnt++;
			}else {
				oddCnt++;
			}
		}
		
		int[] result = {evenCnt,oddCnt};
		
		return result;
		
	}
	
}
