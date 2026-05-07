package level0;

public class Exam13 {//아이스 아메리카노
	public static void main(String[] args) {
		int[] arr = solution(5500);
		System.out.print("{");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i != arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
	public static int[] solution(int money) {
		int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        
        return answer;
	}
}
