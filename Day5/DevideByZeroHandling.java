import java.util.Scanner;
public class DevideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.println("�������� �Է��ϼ���: ");
			int a = scanner.nextInt();
			System.out.println("�������� �Է��ϼ���: ");
			int b= scanner.nextInt();
			try {
				System.out.println(a+" ������ "+b+"�� "+(a/b)+"�Դϴ�.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");
			}
		}
	}

}
