import java.util.Scanner;
public class Lecture_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2)");
		int com =(int) (Math.random()*10)%3;
		int human = scanner.nextInt();
		
		if(com==0) {
			System.out.print ("인간: "+human+" "+"컴퓨터: "+com+"     ");
			if(human==0)System.out.println("비겼습니다");
			if(human==1) System.out.println("인간 승리");
			if(human==2)System.out.println("컴퓨터 승리");
			
		}
		if(com==1) {
			System.out.print ("인간: "+human+" "+"컴퓨터: "+com+"     ");
			if(human==0)System.out.println("컴퓨터 승리");
			if(human==1) System.out.println("비겼습니다.");
			if(human==2)System.out.println("인간 승리");
		}
		
		if(com==2) {
			System.out.print ("인간: "+human+" "+"컴퓨터: "+com+"     ");
			if(human==0)System.out.println("인간 승리");
			if(human==1) System.out.println("컴퓨터 승리");
			if(human==2)System.out.println("비겼습니다.");
		}
		
		
		
	}
	

}
