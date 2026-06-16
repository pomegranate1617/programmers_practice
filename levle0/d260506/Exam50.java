package levle0.d260506;

public class Exam50 {//가위 바위 보
	public static void main(String[] args) {
		//조건
		//가위 2 바위 0 보 5
		//모두 이기는 경우 낸 순서 출력
		
		//문자열 분리
		//가위는 주먹 ,바위는 보,보는 가위
		System.out.println(solution("2"));
		System.out.println(solution("205"));
	}
	
	public static String solution(String rsp) {
		
		String[] arr = rsp.split("");
		
		StringBuilder sb = new StringBuilder("");
		
		for(String split : arr) {
			
			if(split.equals("2")) {
				sb.append("0");
			}
			if(split.equals("0")) {
				sb.append("5");
			}
			if(split.equals("5")) {
				sb.append("2");
			}
			
		}
		
		return sb.toString();
	}

}
