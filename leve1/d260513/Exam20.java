package leve1.d260513;

public class Exam20 {//제일 작은 수 제거하기
	public static void main(String[] args) {
		
		int[] arr = solution(new int[] {4,3,2,1});
		
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("======================");
		
		
		int[] arr2 = solution(new int[] {10});
		
		for(int num : arr2) {
			System.out.println(num);
		}
		System.out.println("=========================");
		
		
		int[] arr3 = solution(new int[1]);
		
		for(int num : arr3) {
			System.out.println(num);
		}
		System.out.println("=======================");
		
		
		int[] arr4 = solution(new int[0]);
		
		for(int num : arr4) {
			System.out.println(num);
		}

	}
	
	public static int[] solution(int[] arr) {
			//if(arr.length <= 0)
			try {
				if(arr.length == 1) {
					return new int[] {-1};
				}else {
					
					int min = arr[0];
					
					for(int num : arr) {
						
						if(min>num) {
							min = num;
						}
					}
					
					int[] newArr = new int[arr.length - 1];
					int idx = 0;
					
					for(int i=0;i<arr.length;i++) {
						
						if(arr[i] != min) {
							newArr[idx++] = arr[i];
						}
						
					}
					
					return newArr;
				}
			}catch(Exception e) {
				return new int[] {-1};
			}
			
	}
	
	
	
	
}
