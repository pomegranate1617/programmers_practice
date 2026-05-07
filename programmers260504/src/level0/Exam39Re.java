package level0;

public class Exam39Re {//약수 구하기
	public static void main(String[] args) {
		
	}
	public static int[] solution(int n) {
		int cnt = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		
		int[] arr = new int[cnt];
		
		int index = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				arr[index] = i;
				index++;
			}
		}
		
		return arr;
	}

}
