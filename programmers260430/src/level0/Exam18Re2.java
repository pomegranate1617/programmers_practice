package level0;

public class Exam18Re2 {//특정 문자 제거하기
	public static void main(String[] args) {
		System.out.println(solution("abcdef","f"));
		System.out.println(solution("BCBdbe","B"));
	}
	public static String solution(String myString,String letter) {
		StringBuilder sb = new StringBuilder (myString);
		while(true) {
			int delIndex = sb.indexOf(letter);
			if(delIndex != -1) {
				sb.delete(delIndex,delIndex + 1);
			}else {
				break;
			}		
		}
		String result = sb.toString();
		return result;
		
	}
}
