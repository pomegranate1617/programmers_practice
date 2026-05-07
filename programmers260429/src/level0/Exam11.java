package level0;

public class Exam11 {//피자 나눠먹기(3)
	public static void main(String[] args) {
		System.out.println(solution(7,10));
	}
	public static int solution(int slice, int n) {
		return (n+(slice-1))/slice;
    }
	
}
