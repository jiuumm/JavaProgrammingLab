import java.util.Scanner;

public class Lecture_2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int sum=0;
		while(n!=-1) {
			System.out.println("������ �Է��Ͻÿ� : ");
			n=scanner.nextInt();
			if(n!=-1)sum+=n;
		}
		System.out.println("������ ���� "+sum+"�Դϴ�.");
		
	}


}
