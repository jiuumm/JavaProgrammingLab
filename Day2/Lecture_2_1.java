import java.util.Scanner;
public class Lecture_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner  = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		int n = scanner.nextInt();
		
		if(n%2==0) {
			System.out.println("�Էµ� ������ ¦���Դϴ�.");
		}
		if(n%2!=0) {
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		}
	}

}
