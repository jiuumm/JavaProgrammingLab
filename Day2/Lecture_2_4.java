import java.util.Scanner;

public class Lecture_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("학점을 입력하시오 ");
		int n = scanner.nextInt();
		
		switch(n/10) {
		case 9:
			System.out.println("학점 : A");
			break;
		case 8:
			System.out.println("학점 : B");
			break;
		case 7:
			System.out.println("학점 : C");
			break;
			
		
		}


		

	}

}
