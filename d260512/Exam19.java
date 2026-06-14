package leve1.d260512;

public class Exam19 {//핸드폰 번호 가리기
	public static void main(String[] args) {
		
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}
	
	public static String solution(String phone_number) {
		
		StringBuilder masking = new StringBuilder(phone_number);
		
		for(int i=0;i<phone_number.length()-4;i++) {
			masking.replace(i,i+1,"*");
		}

		return masking.toString();
	}

}
