import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
	public static int quotient(int a, int b) throws ArithmeticException{
		return a/b;
	}
	//예외를 호출한 쪽에 예외를 던지는 메서드!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			try {
			System.out.println("나뉨수를 입력하시오.");
			int a = scanner.nextInt();
		
			System.out.println("나눗수를 입력하시오.");
			int b= scanner.nextInt();
			
			System.out.println("몫은 "+ quotient(a,b));
			//여기에 예외를 떠넘긴다.
			break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 시도!");
				//0을 넣으면 어차피 처리는 되므로 굳이 토큰을 버릴 필요가 없다.
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요.");
				scanner.next();
				// string들어오면 그 토큰을 버리기 위해서
				// 처리한다.
			}
			
			
		}
	}

}
