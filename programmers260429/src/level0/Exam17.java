package level0;

public class Exam17 {//문자 반복 출력하기
	public static void main(String[] args) {
		String newStr = solution("hello",3);
		System.out.println(newStr);
	}
	public static String solution(String my_string,int n) {
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<my_string.length();i++) {
			String split = my_string.substring(i,i+1);
			for(int j=0;j<n;j++) {
				sb.append(split);
			}
		}
		
		String result = sb.toString();
		
		return result;
	}
}
