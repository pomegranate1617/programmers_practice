package levle0.d260508;

public class Exam63 {//0떼기
	public static void main(String[] args) {
		System.out.println(solution("0010"));
		System.out.println(solution("854020"));
		System.out.println(solution("010332"));
	}
	public static String solution(String n_str) {
		//처음으로 0이 아닌수가 나올때까지 0제거
		
		String[] arr = n_str.split("");
		
		boolean firstNotZero = false;
		int idx = 0;
		
		while(!firstNotZero) {
			
			if(arr[idx].equals("0")) {
				arr[idx] = "-1";
				idx++;
			}else {
				firstNotZero = true;
			}
		}
		
		StringBuilder sb = new StringBuilder("");
		
		for(String num : arr) {
			
			if(!num.equals("-1")) {
				sb.append(num);
			}
		}
		
		return sb.toString();
	}

}
