package level1;

public class Exam9 {//하샤드 수
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
		System.out.println(solution(1));
	}
	public static boolean solution(int x) {
		
		String xStr = x + "";
		
		String[] splitArr = xStr.split("");
		
		int digitSum = 0;
		
		for(int i=0;i<splitArr.length;i++) {
			digitSum += Integer.parseInt(splitArr[i]);
		}
		
		if(x % digitSum == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
