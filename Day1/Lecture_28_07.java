import java.util.Scanner;

public class Lecture_28_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오 : ");
		String name = sc.next();
		
		System.out.println("나이를 입력하시오 : ");
		int age = sc.nextInt();
		
		System.out.println(name+"님 안녕하세요! " +age+"살이시네요." );
	}

}
