package levle0.d260507;

public class Exam57 {//인덱스 바꾸기
	public static void main(String[] args) {
		System.out.println(solution("hello",1,2));
		System.out.println(solution("I love you",3,6));
	}
	public static String solution(String my_string,int num1,int num2) {
		
		StringBuilder sb = new StringBuilder(my_string);
		
		String box = my_string.charAt(num1) + "";
		//my_string문자열은 변동이 없으므로 변수 선언해서 저장해 놓을 필요 없음.
		
		sb.replace(num1,num1+1,my_string.charAt(num2) + "");
		sb.replace(num2,num2+1,box);

		
		return sb.toString();
	}

}
