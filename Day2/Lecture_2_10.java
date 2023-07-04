import java.util.Scanner;

public class Lecture_2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int sum=0;
		while(n!=-1) {
			System.out.println("정수를 입력하시오 : ");
			n=scanner.nextInt();
			if(n!=-1)sum+=n;
		}
		System.out.println("정수의 합은 "+sum+"입니다.");
		
	}


}
