package leve1.d260514;

public class Exam28 {//행렬의 덧셈
	public static void main(String[] args) {
		
		int[][] arr = solution(new int[][] {{1,2},{2,3}},new int[][] {{3,4},{5,6}});
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[1].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] solution(int[][] arr1,int[][] arr2){
		//int[행][열]
		int rowLength = arr1.length;
		int columnLength = arr1[1].length;
		
		int[][] result = new int[rowLength][columnLength];
		
		for(int i=0;i<rowLength;i++) {
			
			for(int j=0;j<columnLength;j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return result;
	}

}
