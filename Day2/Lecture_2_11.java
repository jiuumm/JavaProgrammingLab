import java.util.Scanner;

public class Lecture_2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int month=0;
		while(month<1||month>12) {
			System.out.println("올바른 월을 입력하시오 [1-12]");
			month = scanner.nextInt();
		}
		System.out.println("사용자가 입력한 월은 "+ month);
	}

}
