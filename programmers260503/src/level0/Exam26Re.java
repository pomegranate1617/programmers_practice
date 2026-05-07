package level0;

public class Exam26Re {//모음제거
	public static void main(String[] args) {
		System.out.println(solution("bus"));
		System.out.println(solution("nice to meet you"));
	}
	public static String solution(String my_string) {
		String[] vowel = {"a","e","i","o","u"};
		for(int i=0;i<vowel.length;i++) {
			my_string = my_string.replace(vowel[i],"");
		}
		
		return my_string;
	}
}
