import java.util.Scanner;
public class Lecture_28_11 {
	public static void toC() {
		
	//ȭ���µ�-> �����µ�	
		Scanner sc= new Scanner(System.in);
		System.out.println("ȭ���µ��� �Է��Ͻÿ�: ");
		double f= sc.nextDouble();
		double c = (f-32)/1.8;
		System.out.println("���� �µ��� "+c );
	}
	public static void toF() {
		//�����µ�-> ȭ���µ�
		Scanner sc= new Scanner(System.in);
		System.out.println("�����µ��� �Է��Ͻÿ�: ");
		double c= sc.nextDouble();
		double f = (c*1.8)+32;
		System.out.println("ȭ�� �µ��� "+f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("1. ȭ��-> ����");
		System.out.println("2. ����-> ȭ��");
		System.out.println("===========================");

		System.out.println("��ȣ�� �����Ͻÿ�: ");
		int num= sc.nextInt();
		
		switch(num) {
		
		case 1:
			toC();
			break;
		case 2:
			toF();
			break;
			
		}
	}

}
