package level1;

public class Exam5 {//정수 내림차순으로 배치하기
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
	public static long solution(long n) {
		String transN = n + "";
		int[] arr = new int[transN.length()];
		for(int i=0;i<transN.length();i++) {
			arr[i] = Integer.parseInt(transN.charAt(i) + "");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i== arr.length-1) {
				break;
			}
			if(arr[i]>arr[i+1]) {
				int box = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = box;
			}
		}
		long result = 0;
		for(int i=arr.length-1;i>=0;i--) {
			int digit = 1;
			for(int j=0;j<i;j++) {
				digit *= 10;
			}
			result += (arr[i]*digit);
		}
		
		return result;
	}
}
