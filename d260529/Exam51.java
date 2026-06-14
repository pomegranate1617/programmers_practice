package leve1.d260529;

import java.util.ArrayList;
import java.util.List;

public class Exam51 {//기사단원의 무기//다른 사람코드보기
	public static void main(String[] args) {
		System.out.println(solution(5,3,2));
		System.out.println(solution(10,3,2));
		System.out.println(solution(25,2,1));
		System.out.println(solution(25,4,3));
	}
	
	public static int solution(int number,int limit,int power) {
		//1부터 number까지의 각각의 수의 약수 개수 구하기
		//각 수의 약수가 limit을 넘는지 확인
		//넘는 경우 power사용 안넘는 경우 해당 수의 약수갯수만큼의 공격무기 사용
		//무기 공격력 = 철의 무게
		
		List<Integer> weaponPowerList = new ArrayList<>();
		
		
		
		for(int i=1;i<=number;i++) {
			
			double sqrtNum = Math.sqrt(i);
			int factorCnt = 0;
			
			for(int j = 1; j <= sqrtNum; j++) {
				
				if(i % j == 0) {
					
					//int와 double 끼리의 비교는 비정확...
//					if(j ==  sqrtNum) {
					
					if(j*j == i) {
						factorCnt++;
					}else {
						factorCnt += 2;
					}
				}
			}
			
			
			if(factorCnt<=limit) {
				weaponPowerList.add(factorCnt);
			}else {
				weaponPowerList.add(power);
			}
		}
		
		
		int ironWeight = 0;
		
		for(int weaponPower : weaponPowerList) {
			ironWeight += weaponPower;
		}
		
		return ironWeight;
		
		
	}

}
