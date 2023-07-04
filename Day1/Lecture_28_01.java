import java.util.Scanner;

public class Lecture_28_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하시오: ");
		
		int time = sc.nextInt();
		int minute = time/60;
		int second = time%60;
		
		System.out.println(time+"초는 " + minute+"분 "+ second+"초 입니다.");
		
	
	
	
	}

}
