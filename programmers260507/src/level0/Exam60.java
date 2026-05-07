package levle0.d260507;


public class Exam60 {//정수 찾기
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,5},3));
		System.out.println(solution(new int[] {15,98,23,2,15},20));
	}
	public static int solution(int[] num_list,int n) {
		
		for(int i=0;i<num_list.length;i++) {
			if(num_list[i] == n) {
				return 1;
			}
		}
		
		return 0;
	}
}
