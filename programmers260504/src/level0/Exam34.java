package level0;

public class Exam34 {//n의 배수 고르기
	public static void main(String[] args) {
		int[] arr = solution(3,new int[] {4,5,6,7,8,9,10,11,12});
		for(int num : arr) {
			System.out.println(num);
		}
	}
	public static int[] solution(int n,int[] numlist) {
		
		int cnt = 0;
		
		for(int num :numlist) {
			if(num%n == 0) {
				cnt++;
			}
		}
		
		int [] delArr = new int[cnt];
		int delIndex = 0;
		
		for(int num : numlist){
			if(num%n == 0) {
				delArr[delIndex] = num;
				delIndex++;
			}
		}
		
		return delArr;
	}
}
