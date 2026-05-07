package level0;

public class Exam29 {//삼각형의 완성조건(1)
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3}));
	}
	public static int solution(int[] sides) {
		int maxSide = sides[0];
		int allSideSum = 0;
		
		for(int side : sides) {
			allSideSum += side;
			
			if(maxSide<side) {
				maxSide = side;
			}
		}
		
		if(maxSide<allSideSum-maxSide) {
			return 1;
		}else {
			return 2;
		}
		
	}

}
