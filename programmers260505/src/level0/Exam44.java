package level0;

public class Exam44 {//중앙값 구하기
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,7,10,11}));
		System.out.println(solution(new int[] {9,-1,0}));
	}
	public static int solution(int[] array) {
		
		while(true) {
			boolean sort = false;
			for(int i=1;i<array.length;i++) {
				if(array[i-1]>array[i]) {
					sort = true;
					int box = array[i-1];
					array[i-1] = array[i];
					array[i] = box;	
				}
			}
			if(sort == false) {
				break;
			}
		}
		
		int middleIndex = (int)Math.round(array.length - 1)/2;
		
		return array[middleIndex];
	}

}
