package level1;

public class Exam5Re4 {//정수 내림차순으로 배치하기
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
	public static long solution(long n) {
		String numberStr = n + "";
		
		char[] charArr = new char[numberStr.length()];
		
		for(int i=0;i<numberStr.length();i++) {
			charArr[i] = numberStr.charAt(i);
		}
		
		for(int i=0;i<charArr.length;i++) {
			for(int j=i;j<charArr.length;j++) {
				if(charArr[i]<charArr[j]) {
					char box = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = box;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder("");
		
		for(char num : charArr) {
			sb.append(num + "");
		}
		
		return Long.parseLong(sb.toString());
	}

}
