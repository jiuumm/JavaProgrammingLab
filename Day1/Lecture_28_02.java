import java.util.Scanner;
public class Lecture_28_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String day = sc.nextLine();
		String today="";
		
		switch(day) {
		
		case "SAT":
			today= "�ָ�";
			break;
			
		case "SUN":
			today = "�ָ�";
			break;
			
		case "MON":
			today = "����";
			break;
			
		case "WED":
			today="����";
			break;
			
		case "THU":
			today="����";
			break;
			
		case "FRI":
			today = "����";
			break;	
			
		default:
			System.out.println("�ƹ��͵� �ƴ�");
			break;
		
		}
		
		System.out.println(today);
		
	}
	


}
