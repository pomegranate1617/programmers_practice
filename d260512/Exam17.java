package leve1.d260512;

public class Exam17 {//서울에서 김서방 찾기
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"Jane","Kim"}));
	}
	
	public static String solution(String[] seoul) {
		
		int x = 0;
		
		for(String name : seoul) {
			
			if(name.equals("Kim")) {
				break;
			}
			x++;
		}
		
		return "김서방은 " + x + "에 있다";
	}

}
