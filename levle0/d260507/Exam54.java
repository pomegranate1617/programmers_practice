package levle0.d260507;

public class Exam54 {//최대값 만들기(2)
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,-3,4,-5}));
		System.out.println(solution(new int[] {0,-31,24,10,1,9}));
		System.out.println(solution(new int[] {10,20,30,5,5,20,5}));
		//{1,-3}
		//{-2,-3,1,2}
	}
	public static int solution(int[] numbers) {
		
		int max = numbers[0] * numbers[1];
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++) {
				if((j != i) && (numbers[i] * numbers[j]) > max) {
					max = numbers[i] * numbers[j];
				}
			}
		}
		
		return max;
	}
}
