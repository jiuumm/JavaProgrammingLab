import java.util.Scanner;
public class Lecture_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2)");
		int com =(int) (Math.random()*10)%3;
		int human = scanner.nextInt();
		
		if(com==0) {
			System.out.print ("�ΰ�: "+human+" "+"��ǻ��: "+com+"     ");
			if(human==0)System.out.println("�����ϴ�");
			if(human==1) System.out.println("�ΰ� �¸�");
			if(human==2)System.out.println("��ǻ�� �¸�");
			
		}
		if(com==1) {
			System.out.print ("�ΰ�: "+human+" "+"��ǻ��: "+com+"     ");
			if(human==0)System.out.println("��ǻ�� �¸�");
			if(human==1) System.out.println("�����ϴ�.");
			if(human==2)System.out.println("�ΰ� �¸�");
		}
		
		if(com==2) {
			System.out.print ("�ΰ�: "+human+" "+"��ǻ��: "+com+"     ");
			if(human==0)System.out.println("�ΰ� �¸�");
			if(human==1) System.out.println("��ǻ�� �¸�");
			if(human==2)System.out.println("�����ϴ�.");
		}
		
		
		
	}
	

}
