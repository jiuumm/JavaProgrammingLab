import java.util.Scanner;
public class DevideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			System.out.println("나뉨수를 입력하세요: ");
			int a = scanner.nextInt();
			System.out.println("나눗수를 입력하세요: ");
			int b= scanner.nextInt();
			try {
				System.out.println(a+" 나누기 "+b+"는 "+(a/b)+"입니다.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
	}

}
