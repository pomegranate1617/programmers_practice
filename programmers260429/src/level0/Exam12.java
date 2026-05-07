package level0;

public class Exam12 {//배열의 평균값
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		solution(numbers);
	}
	public static double solution(int[] numbers) {
		int sum = 0;
        double avg = 0;
        for(int i : numbers){
            sum += i;
        }
        avg = sum / (double)numbers.length;
        return avg;
    }
}
