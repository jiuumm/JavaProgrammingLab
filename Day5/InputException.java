import java.util.InputMismatchException;
import java.util.Scanner;
public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int sum = 0;
		for (int i=0; i<3; i++) {
			System.out.println("���� 3���� �Է��ϼ��� : ");
			try {
				int n = scanner.nextInt();
				//���⿡ ������ �ƴ� �ָ� ������ ���Ͱ� ���ۿ� ���Եǰ�
				// �� ���ʹ� ó������ ����ä ��� �־���. ���� ��� ���Ʒ� �ݺ��Ǵ� ��
				
				sum+=n;
			}
			catch(InputMismatchException e) {
				System.out.println("�ٽ� �Է��ϼ���!");
				scanner.next();//���͸Ծ��..
				i--;
				
			}
			
		}
		System.out.println("�� ���� "+ sum);
	}

}
