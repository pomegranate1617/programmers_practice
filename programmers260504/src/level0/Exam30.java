package level0;

public class Exam30 {//대문자와 소문자
	public static void main(String[] args) {
		System.out.println(solution("cccCCC"));
		System.out.println(solution("abCdEfghIJ"));
	}
	public static String solution(String my_string) {
		char[] arr = new char[my_string.length()];
		
		for(int i=0;i<arr.length;i++) {
			char chracter = my_string.charAt(i);
			
			if(chracter>='A' && chracter<='Z') {
				arr[i] = Character.toLowerCase(chracter);
			}
			else if(chracter>='a' && chracter<='z') {
				arr[i] = Character.toUpperCase(chracter);
			}
		}
		
		StringBuilder sb = new StringBuilder("");
		
		for(char character2: arr) {
			sb.append(character2);
		}
		
		return sb.toString();
	}
}
