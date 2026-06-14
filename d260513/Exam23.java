package leve1.d260513;

public class Exam23 {//수박수박수박수박수박수?
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
	
	public static String solution(int n) {
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<n/2;i++) {
			sb.append("수박");
		}
		
		if(n%2 != 0) {
			sb.append("수");
		}
		
		return sb.toString();	
	}//다른 사람 풀이 보기 "\0"관련

}
