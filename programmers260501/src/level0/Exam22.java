package level0;

public class Exam22 {//배열 자르기
	public static void main(String[] args) {
		int[] arr = solution(new int[] {1,2,3,4,5},1,3);
		System.out.print("[");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(",");
			}
		}
		
		System.out.print("]");
//		System.out.print();
	}
	public static int[] solution(int[] numbers,int num1,int num2) {
		int[] newArr = new int[num2-num1+1];
		for(int i=0;i<newArr.length;i++) {
			newArr[i] = numbers[i+num1];
		}
		return newArr;
	}
}
