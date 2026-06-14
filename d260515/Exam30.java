package leve1.d260515;

public class Exam30 {//같은 숫자는 싫어
	public static void main(String[] args) {
		int[]arr = solution(new int[] {1,1,3,3,0,1,1});
		
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("===============");
		
		int[] arr2 = solution(new int[] {4,4,4,3,3});
		
		for(int num : arr2) {
			System.out.println(num);
		}
		System.out.println("=========================");
		
		int[] arr3 = solution(new int[] {1,0,3,1,2,1,2,0});
		
		for(int num : arr3) {
			System.out.println(num);
		}
	}
	
	public static int[] solution(int[] arr) {
		
		int prevNum = -1;
		int atomCnt = arr.length;
		
		for(int i=0;i<arr.length;i++) {
			
			if(prevNum != arr[i]) {
				prevNum = arr[i];
			}else {
				
				arr[i] = -1;
				atomCnt--;
			}
		}
		
		int[] newArr = new int[atomCnt];
		int idx = 0;
		
		for(int num : arr) {
			
			if(num != -1) {
				newArr[idx] = num;
				idx++;
			}
		}
		
		return newArr;
		
	}

}
