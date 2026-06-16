package levle0.d260508;

public class Exam65 {//글자 이어붙여 문자열 만들기
	public static void main(String[] args) {
		System.out.println(solution("cvsgiorszzzmrpaqpe",new int[] {16,6,5,3,12,14,11,11,17,12,7}));
		System.out.println(solution("zpiaz",new int[] {1,2,0,0,3}));
	}
	public static String solution(String my_string,int[] index_list) {
		
		StringBuilder sb = new StringBuilder("");
		
		for(int num : index_list) {
			sb.append(my_string.charAt(num));
		}
		
		return sb.toString();
	}
}
