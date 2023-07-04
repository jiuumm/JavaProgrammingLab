import java.util.Scanner;
public class Lecture_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner  = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int n = scanner.nextInt();
		
		if(n%2==0) {
			System.out.println("입력된 정수는 짝수입니다.");
		}
		if(n%2!=0) {
			System.out.println("입력된 정수는 홀수입니다.");
		}
	}

}
