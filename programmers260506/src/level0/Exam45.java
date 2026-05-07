package levle0.d260506;

public class Exam45 {//조건에 맞게 수열 변환하기3
	public static void main(String[] args) {
		int[] arr = solution(new int[] {1,2,3,100,99,98},3);
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("---------------------");
		int[] arr2 = solution(new int[] {1,2,3,100,99,98},2);
		for(int num : arr2) {
			System.out.println(num);
		}
	}
	public static int[] solution(int[] arr,int k) {
		
		if(k%2 == 1) {
			for(int i=0;i<arr.length;i++) {
				arr[i] *= k;
			}
		}else {
			for(int i=0;i<arr.length;i++) {
				arr[i] += k;
			}
		}
		
		return arr;
	}

}
