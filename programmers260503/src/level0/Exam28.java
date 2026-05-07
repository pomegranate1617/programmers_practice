package level0;

public class Exam28 {//배열 원소의 길이
	public static void main(String[] args) {
		int[] arr = solution(new String[] {"We","are","the","world!"});
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	public static int[] solution(String[] strlist){
		
		int[] arr = new int[strlist.length];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = strlist[i].length();
		}
		
		return arr;
	}
}
