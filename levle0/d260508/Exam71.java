package levle0.d260508;

public class Exam71 {//배열 비교하기
	public static void main(String[] args) {
		System.out.println(solution(new int[] {49,13},new int[] {70,11,2}));
		System.out.println(solution(new int[] {100,17,84,1},new int[] {44,12,65,36}));
		System.out.println(solution(new int[] {1,2,3,4,5},new int[] {3,3,3,3,3}));
	}
	public static int solution(int[] arr1,int[] arr2) {
		
		if(arr1.length>arr2.length) {
			return 1;
		}else if(arr1.length<arr2.length) {
			return -1;
		}else {
			
			int arr1Sum = 0;
			int arr2Sum = 0;
			
			for(int i=0;i<arr1.length;i++) {
				arr1Sum += arr1[i];
				arr2Sum += arr2[i];
			}
			
			if(arr1Sum>arr2Sum) {
				return 1;
			}else if(arr1Sum<arr2Sum) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}
