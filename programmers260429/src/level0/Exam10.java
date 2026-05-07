package level0;

public class Exam10 {//피자 나눠 먹기(1)
	public static void main(String[] args) {
		System.out.println(solution(7));
	}
	public static int solution(int n) {
        return (int)Math.ceil(n/(double)7);
    }
}
