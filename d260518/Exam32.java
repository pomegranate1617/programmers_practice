package leve1.d260518;

public class Exam32 {//크기가 작은 부분 문자열
	public static void main(String[] args) {
		System.out.println(solution("3141592","271"));
		System.out.println(solution("500220839878","7"));
		System.out.println(solution("10203","15"));
		System.out.println(solution("3","4"));
		System.out.println(solution("4","3"));
	}
	
	public static int solution(String t,String p) {
		
		int partCnt = 0;
		
		for(int i=0;i<t.length();i++) {
			
			if(i+p.length() <= t.length()) {
				
				String part = t.substring(i,i+p.length());
				
				if(Long.parseLong(part)<=Long.parseLong(p)) {
					partCnt++;
				}
			}
			else {
				break;
			}
		}
		
		return partCnt;
	}

}
