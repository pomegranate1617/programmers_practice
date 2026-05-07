package level1;

public class Exam4 {//자연수 뒤집어 배열로 만들기
	public static void main(String[] args) {
		int[] arr = solution(12345);
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i != arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	public static int[] solution(long n) {
		String reverse = n + "";
		int length = reverse.length();
		int[] reverseArr  = new int[length];
		
		for(int i= length-1;i>=0;i--) {
			reverseArr[length-1-i] = Integer.parseInt(reverse.charAt(i)+"");
		}
		
		return reverseArr;
	}
}
