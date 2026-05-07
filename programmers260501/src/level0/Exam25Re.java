package level0;

public class Exam25Re {//최댓값 만들기(1)
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,5}));
		System.out.println(solution(new int[] {0,31,24,10,1,9}));
	}
	public static int solution(int[] numbers) {
		//max와 max보다 작은 수들 사이에서 최고값의 곱
		//{2,1}
		//{1,2}
		//{1,1}
		int max = numbers[0];
		int maxIndex = 0;
		int secondMax = 0;
		for(int i=0;i<numbers.length;i++) {
			if(max<numbers[i]) {
				max = numbers[i];
				maxIndex = i;
			}	
		}
		
		for(int i=0;i<numbers.length;i++) {
			if(i==maxIndex) {
				continue;
			}
			if(secondMax<numbers[i]) {
				secondMax = numbers[i];
			}
		}
		
		
		return max*secondMax;
	}
}
