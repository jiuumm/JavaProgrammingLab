import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
	public static int quotient(int a, int b) throws ArithmeticException{
		return a/b;
	}
	//���ܸ� ȣ���� �ʿ� ���ܸ� ������ �޼���!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			try {
			System.out.println("�������� �Է��Ͻÿ�.");
			int a = scanner.nextInt();
		
			System.out.println("�������� �Է��Ͻÿ�.");
			int b= scanner.nextInt();
			
			System.out.println("���� "+ quotient(a,b));
			//���⿡ ���ܸ� ���ѱ��.
			break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �õ�!");
				//0�� ������ ������ ó���� �ǹǷ� ���� ��ū�� ���� �ʿ䰡 ����.
			}
			catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼ���.");
				scanner.next();
				// string������ �� ��ū�� ������ ���ؼ�
				// ó���Ѵ�.
			}
			
			
		}
	}

}
