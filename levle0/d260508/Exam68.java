package levle0.d260508;

import java.util.Arrays;

public class Exam68 {//뒤에서 5등 위로
	public static void main(String[] args) {
		int[] arr = solution(new int[] {12,4,15,46,38,1,14,56,32,10});
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
	public static int[] solution(int[] num_list) {
		
		Arrays.sort(num_list);
		
		return Arrays.copyOfRange(num_list,5,num_list.length);
	}

}
