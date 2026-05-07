package level0;

public class Exam18 {//특정 문자 제거하기
	public static void main(String[] args) {
		System.out.println(solution("abcdef","f"));
		System.out.println(solution("BCBdbe","B"));
	}
	public static String solution(String my_string,String letter) {
		StringBuilder sb = new StringBuilder(my_string);
	
		int delIndex = my_string.indexOf(letter);
			
		String result = sb.toString();
		boolean containCheck = result.contains(letter);
		
		while(containCheck) {
			result = sb.delete(delIndex,delIndex+1).toString();
			//두번째 매개변수에 delIndex++집어넣으면 왜 안되지?
		}
			
		return result;
	}
}
