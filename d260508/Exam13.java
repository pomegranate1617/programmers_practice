package leve1.d260508;

public class Exam13 {//문자열 내 p와 y의 개수
	public static void main(String[] args) {
		
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
		System.out.println(solution("abcd"));
	}
	
	public static boolean solution(String s) {
		String lowerS = s.toLowerCase();
		
		int pCnt = 0;
		int yCnt = 0;
		
		for(int i=0;i<lowerS.length();i++) {
			
			if(lowerS.substring(i,i+1).equals("p")) {
				pCnt++;
				continue;
			}
			
			if(lowerS.substring(i,i+1).equals("y")) {
				yCnt++;
			}
		}
		
		if(pCnt == 0 && yCnt == 0) {
			return true;
		}else {
			
			return pCnt == yCnt ? true : false;
		}
	}

}
