package level2.d260612;

public class Exam2 {//JdenCase문자열 만들기
	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
		System.out.println(solution("   she  eat  aPple "));
	}
	
	public static String solution(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		
		String prev = "";
		
		for(int i = 0; i < sb.length(); i++) {
			
			if(prev.equals(" ") || i == 0) {
				sb.replace(i, i + 1, sb.substring(i, i+1).toUpperCase());
			}else {
				sb.replace(i, i + 1, sb.substring(i, i+1).toLowerCase());
			}
			
			prev = sb.substring(i, i+1);
		}
		
		return sb.toString();
	}

}
