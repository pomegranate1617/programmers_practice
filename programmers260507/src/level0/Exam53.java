package levle0.d260507;

public class Exam53 {//원소들의 곱과 합
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,4,5,2,1}));
		System.out.println(solution(new int[] {5,7,8,3}));
	}
	public static int solution(int[] num_list) {
		
		int mulAll = 1;
		int sumAll = 0;
		
		for(int num : num_list) {
			
			mulAll *= num;
			sumAll += num;
			
		}
		
		if(mulAll < sumAll*sumAll) {
			return 1;
		}else if(mulAll > sumAll * sumAll) {
			return 0;
		}
		return -1;
	}

}
