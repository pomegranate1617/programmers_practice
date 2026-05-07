package level1;

public class Exam8 {//평균 구하기
	public static void main(String[] args) {
		System.out.println(solution(new int [] {1,2,3,4}));
		System.out.println(solution(new int [] {5,5}));
	}
	public static double solution(int[] arr) {
		
		int total = 0;
		
		for(int num : arr) {
			total += num;
		}
		
		return (double)total/arr.length;
	}
}
