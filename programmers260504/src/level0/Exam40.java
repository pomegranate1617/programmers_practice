package level0;

public class Exam40 {//짝수는 싫어요
	public static void main(String[] args) {
		int[] arr1 = solution(10);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		int[] arr2 = solution(15);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
	public static int[] solution(int n) {
		int cnt = 0;
		
		if(n%2==0) {
			cnt = n/2;
		}else {
			cnt = (n/2 + 1);
		}
		
		int[] arr = new int[cnt];
		int index = 0;
		
		for(int i=1;i<=n;i++) {
			if(i%2 != 0) {
				arr[index] = i;
				index++;
			}
		}
		
		return arr;
	}
}
