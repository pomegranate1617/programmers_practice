package level0;

public class Exam14 {//배열 뒤집기
	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		int[] newArr = solution(num_list);
	}
	public static int[] solution(int[] num_list) {
		
		int[] newArr = new int[num_list.length];
		int cnt = num_list.length-1;
		
		for(int i=0;i<num_list.length;i++) {
			newArr[i] = num_list[cnt];
			cnt--;
		}
		
		return newArr;
	}
}
