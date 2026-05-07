package level0;

public class Exam39 {//약수 구하기
	public static void main(String[] args) {
		int[] arr = solution(24);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int[] arr2 = solution(29);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

	}
	public static int[] solution(int n) {

		if(n <= 2) {
			if(n==1) {
				return new int[] {1};
			}else {
				return new int[] {1,2};
			}
			
		}else {
			int cnt = 0;
			
			for(int i=1;i<=(int)Math.sqrt(n);i++) {
				if(n%i==0) {
					cnt++;
				}
			}
			cnt *= 2;
			
			if(n%2!=0 && n%(n/2+1)==0) {
				cnt++;
			}
			
			int[] primeArr = new int[cnt];
			int index = 0;
			
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					primeArr[index] = i;
					index++;
				}
			}
			
			return primeArr;
			
		}
	}

}
