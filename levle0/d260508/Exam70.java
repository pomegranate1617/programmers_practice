package levle0.d260508;

public class Exam70 {//배열의 길이에 따라 다른 연산하기
	public static void main(String[] args) {
		int[] arr = solution(new int[] {49,12,100,276,33},27);
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("========================");
		int[] arr2 = solution(new int[] {444,555,666,777},100);
		for(int num : arr2) {
			System.out.println(num);
		}
	}
	public static int[] solution(int[] arr,int n) {
		
		if(arr.length % 2 == 0) {
			for(int i=0;i<arr.length;i++) {
				if(i%2 != 0) {
					arr[i] += n;
				}
			}
		}else {
			for(int i=0;i<arr.length;i++) {
				if(i%2 == 0) {
					arr[i] += n;
				}
			}
		}
		
		return arr;
	}
}
