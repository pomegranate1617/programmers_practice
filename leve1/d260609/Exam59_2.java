package leve1.d260609;

public class Exam59_2 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {1,2,7,6,4}));
	}
	
	public static int solution(int[] nums) {
		//다수의 테스트케이스에서 런타임 에러 => 팩토리얼로 인해 long값도 초과
		
		//nCr = n!/(r!*(n-r)!)

		int elementCnt = nums.length;
		int choiceCnt = 3;
		
		int elementFactorial = 1;
		int choiceFactorial = 1;
		int eachCntMinusFactorial = 1;
		
		int eachCntMinus = elementCnt-choiceCnt;
		
		for(int i=1;i<=elementCnt;i++) {
			elementFactorial *= i;
			
			if(i <= choiceCnt) {
				choiceFactorial *= i;
			}
			
			if(i <= eachCntMinus) {
				eachCntMinusFactorial *= i;
			}
		}
		
		int maxNum = 0;
		int numberOfCase =  elementFactorial/(choiceFactorial*eachCntMinusFactorial);
		
		int[] addNumArr = new int[numberOfCase];
		int arrIdx = 0;
		
		for(int i=0;i<elementCnt;i++) {
			
			for(int j=i+1;j<elementCnt;j++) {
				
				for(int k=j+1;k<elementCnt;k++) {
					
					int sumNum = nums[i] + nums[j]+ nums[k];
					
					addNumArr[arrIdx++] = sumNum;
					
					if(sumNum>maxNum) {
						maxNum = sumNum;
					}
				} 
			}
		}
		
//		System.out.print("배열출력:");
//		System.out.println(Arrays.toString(addNumArr));
		
		
		boolean[] notPrime = new boolean[maxNum+1];
		
		for(int i=2;i<notPrime.length;i++) {
			for(int j=i*i; j<notPrime.length; j+=i) {
				notPrime[j] = true;
			}
		}
		
		int factorCnt = 0;
		
		for(int num : addNumArr) {
			if(notPrime[num] == false) {
				factorCnt++;
			}
		}
		
		return factorCnt;
		
		
	}
}
