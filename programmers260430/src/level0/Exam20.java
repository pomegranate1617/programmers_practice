package level0;

public class Exam20 {
	public static void main(String[] args) {
		System.out.println(solution(10,3));
	}
	public static int solution(int n,int k) {
		int payBeverage = k-(n/10);
		int payMoney = 12000 * n + payBeverage*2000;
		return payMoney;
	}
}
