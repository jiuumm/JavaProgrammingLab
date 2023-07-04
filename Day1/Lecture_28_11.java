import java.util.Scanner;
public class Lecture_28_11 {
	public static void toC() {
		
	//È­¾¾¿Âµµ-> ¼·¾¾¿Âµµ	
		Scanner sc= new Scanner(System.in);
		System.out.println("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		double f= sc.nextDouble();
		double c = (f-32)/1.8;
		System.out.println("¼·¾¾ ¿Âµµ´Â "+c );
	}
	public static void toF() {
		//¼·¾¾¿Âµµ-> È­¾¾¿Âµµ
		Scanner sc= new Scanner(System.in);
		System.out.println("¼·¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		double c= sc.nextDouble();
		double f = (c*1.8)+32;
		System.out.println("È­¾¾ ¿Âµµ´Â "+f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("1. È­¾¾-> ¼·¾¾");
		System.out.println("2. ¼·¾¾-> È­¾¾");
		System.out.println("===========================");

		System.out.println("¹øÈ£¸¦ ¼±ÅÃÇÏ½Ã¿À: ");
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
