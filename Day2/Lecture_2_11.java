import java.util.Scanner;

public class Lecture_2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int month=0;
		while(month<1||month>12) {
			System.out.println("�ùٸ� ���� �Է��Ͻÿ� [1-12]");
			month = scanner.nextInt();
		}
		System.out.println("����ڰ� �Է��� ���� "+ month);
	}

}
