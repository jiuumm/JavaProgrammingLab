import java.util.Scanner;
public class Lecture_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner  = new Scanner(System.in);
		System.out.println("학점을 입력하시오 ");
		int n= scanner.nextInt();
		
		if(n>=90) System.out.println("학점 A");
		else if(n>=80) System.out.println("학점 B");
		else if(n>=70) System.out.println("학점 C");

		
	}

}
