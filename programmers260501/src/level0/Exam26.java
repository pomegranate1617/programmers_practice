package level0;

public class Exam26 {//모음제거
	public static void main(String[] args) {
		System.out.println(solution("bus"));
		System.out.println(solution("nice to meet you"));
	}
	public static String solution(String my_string) {
		String[] vowel = {"a","e","i","o","u"};
		String newStr = "";
		for(int i=0;i<vowel.length;i++) {
			newStr = my_string.replace(vowel[i], "");
		}
		return newStr;
	}
}
