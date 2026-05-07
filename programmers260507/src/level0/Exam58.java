package levle0.d260507;

public class Exam58 {//숫자 찾기
	public static void main(String[] args) {
		System.out.println(solution(29183,1));
		System.out.println(solution(232443,4));
		System.out.println(solution(123456,7));
	}
	public static int solution(int num,int k) {
		
		String numStr = num + "";
		int digitNum = numStr.indexOf(k + "");
		
		return (digitNum == -1) ? digitNum : (digitNum + 1);
	}

}
