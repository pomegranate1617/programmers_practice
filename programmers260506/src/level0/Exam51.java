package levle0.d260506;

public class Exam51 {//주사위의 개수
	public static void main(String[] args){
		System.out.println(solution(new int[] {1,1,1},1));
		System.out.println(solution(new int[] {10,8,6},3));
	}
	public static int solution(int[] box,int n) {
		int diceNum = 1;
		
		for(int side : box) {
			diceNum *= (side/n);
		}
		
		return diceNum;
	}
}
