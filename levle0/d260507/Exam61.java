package levle0.d260507;

public class Exam61 {//배열의 원소 삭제하기
	public static void main(String[] args) {
		int[] arr = solution(new int[] {293,1000,395,678,94},new int[] {94,777,104,1000,1,12});
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("========================");
		int[] arr2 = solution(new int[] {110,66,439,785,1},new int[] {377,823,119,43});
		for(int num : arr2) {
			System.out.println(num);
		}
	}
	public static int[] solution(int[] arr,int[] delete_list) {
		
		int delArrLength = arr.length;
		
		for(int num : delete_list) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] == num) {
					arr[i] = -1;
					delArrLength--;
				}
			}
		}
		
		int[] delArr = new int[delArrLength];
		int idx = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != -1) {
				delArr[idx] = arr[i];
				idx++;
			}
		}
		
		return delArr;
	}

}
