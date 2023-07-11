import java.util.InputMismatchException;
import java.util.Scanner;
public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int sum = 0;
		for (int i=0; i<3; i++) {
			System.out.println("정수 3개를 입력하세요 : ");
			try {
				int n = scanner.nextInt();
				//여기에 정수가 아닌 애를 넣으면 엔터가 버퍼에 남게되고
				// 그 엔터는 처리되지 못한채 계속 넣어짐. 따라서 계속 위아래 반복되는 것
				
				sum+=n;
			}
			catch(InputMismatchException e) {
				System.out.println("다시 입력하세요!");
				scanner.next();//엔터먹어가기..
				i--;
				
			}
			
		}
		System.out.println("총 합은 "+ sum);
	}

}
