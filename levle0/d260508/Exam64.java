package levle0.d260508;

public class Exam64 {//n번째 원소부터
	public static void main(String[] args) {
		
		int[] arr = solution(new int[] {2,1,6},3);
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("======================");
		
		int[] arr2 = solution(new int[] {5,2,1,7,5},2);
		for(int num : arr2) {
			System.out.println(num);
		}
		
	}
	public static int[] solution(int[] num_list,int n) {
		
		int[] arr = new int[num_list.length-n+1]; 
		
		System.arraycopy(num_list, n-1, arr, 0, num_list.length-n+1);
		
		return arr;
	}

}
