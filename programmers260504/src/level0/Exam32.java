package level0;

public class Exam32 {//가장 큰 수 찾기
	public static void main(String[] args) {
		int[] arr = solution(new int[] {1,8,3});
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int[] arr2 = solution(new int[] {9,10,11,8});
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr2[i]);
		}
	}
	public static int[] solution(int[] array) {
		int max = array[0];
		int maxIndex = 0;
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
				maxIndex = i;
			}
		}
		
		int[] maxArr = new int[2];
		maxArr[0] = max;
		maxArr[1] = maxIndex;
		
		return maxArr;
	}

}
