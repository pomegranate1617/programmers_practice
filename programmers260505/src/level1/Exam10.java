package level1;

public class Exam10 {//x만큼 간격이 있는 n개의 숫자
	public static void main(String[] args) {
		long[] arr = solution(2,5);
		for(long num : arr) {
			System.out.println(num);
		}
		System.out.println("------------------");
		long[] arr2 = solution(-4,2);
		for(long num : arr2) {
			System.out.println(num);
		}
	}
	public static long[] solution(int x,int n) {
		
		long[] arr = new long[n];
		
		long addX = 0;
		
		for(int i=0;i<n;i++) {
			addX += x;
			arr[i] = addX;
		}
		
		return arr;
	}

}
