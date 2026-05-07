package levle0.d260507;

public class Exam56 {//암호 해독
	public static void main(String[] args) {
		System.out.println(solution("dfjardstddetckdaccccdegk",4));
		System.out.println(solution("pfqallllabwaoclk",2));
	}
	public static String solution(String cipher,int code) {
		
		StringBuilder sb = new StringBuilder("");		
//		for(int i=0;i<cipher.length();i++) {
//			if((i+1)%code != 0) {
//				sb.delete(i,i+1);
//			}
//		}
//반복문 도는 도중에 문자를 삭제하여 문자열길이가 변경되면 위험..
		for(int i=0;i<cipher.length();i++) {
			if((i+1)%code == 0) {
				sb.append(cipher.charAt(i));
			}
		}
		
		return sb.toString();
		//증감식에서 i를 code-1로 증감식을 i+=code로 하면
		//쓸데없는 인덱스 안돌아도 됨...
	}
}
