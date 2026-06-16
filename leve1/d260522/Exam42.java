package leve1.d260522;

import java.util.Arrays;

public class Exam42 {//k번째 수
	public static void main(String[] args) {
		int[] arr = solution(new int[] {1,5,2,6,3,7,4},new int[][] {{2,5,3},{4,4,1},{1,7,3}});
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static int[] solution(int[] array,int[][] commands) {
		
		int[] resultArr = new int[commands.length];
		
		for(int t=0;t<commands.length;t++) {
			
			int i = commands[t][0];
			int j = commands[t][1];
			int k = commands[t][2];
			
			int arrLength = j - i + 1;
			int[] splitArr = new int[arrLength];
			
			System.arraycopy(array, i-1, splitArr, 0, arrLength);
			Arrays.sort(splitArr);
			
			resultArr[t] = splitArr[k-1];
		}
		
		return resultArr;
	}
}
