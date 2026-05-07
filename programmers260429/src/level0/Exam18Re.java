package level0;

public class Exam18Re {//특정 문자 제거하기
	public static void main(String[] args) {
		System.out.println(solution("abcdef","f"));
		System.out.println(solution("BCBdbe","B"));
	}
	public static String solution(String my_string,String letter) {
		StringBuilder sb = new StringBuilder(my_string);
			
		String result = "";
//		String result = my_string;
		//String result = my_string; 으로 하면 왜 값이 아예 안나오지?
		
		while(true) {
			if(result.contains(letter)) {
				int delIndex = my_string.indexOf(letter);
				sb.delete(delIndex,delIndex+1);
				//두번째 매개변수에 delIndex++집어넣으면 왜 안되지?
				//toString()사용시 문자열이 바로 고정되나?
			}else {
				break;
			}	
		}	//다시 풀기
		result = sb.toString();
		return result;
	}
}
