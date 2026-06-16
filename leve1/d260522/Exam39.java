package leve1.d260522;

public class Exam39 {//시저 암호
	public static void main(String[] args) {
		System.out.println(solution("AB",1));
		System.out.println(solution("z",1));
		System.out.println(solution("a B z",4));
		System.out.println(solution("    ",3));
		System.out.println(solution("F   a",5));
	}
	
	public static String solution(String s,int n) {
		
		char[] charArr = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(char character : charArr) {
			
			if(character>='A' && character<='Z') {
				
				if(character + n >'Z') {
					
					char overFlow = (char)(character + n - 'Z');
					
					sb.append(String.valueOf((char)(overFlow + 'A' - 1)));
					
				}else {
					sb.append(String.valueOf((char)(character + n)));
				}
				
			}else if(character>='a' && character<='z') {
				
				if(character + n >'z') {
					
					char overFlow = (char)(character + n - 'z');
					
					sb.append(String.valueOf((char)(overFlow + 'a' - 1)));
					
				}else {
					sb.append(String.valueOf((char)(character + n)));
				}
				
			}else {
				sb.append(character);
			}
		}
		
		return sb.toString();
	}
}
