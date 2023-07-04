import java.util.Scanner;
public class Lecture_28_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String day = sc.nextLine();
		String today="";
		
		switch(day) {
		
		case "SAT":
			today= "林富";
			break;
			
		case "SUN":
			today = "林富";
			break;
			
		case "MON":
			today = "乞老";
			break;
			
		case "WED":
			today="乞老";
			break;
			
		case "THU":
			today="乞老";
			break;
			
		case "FRI":
			today = "乞老";
			break;	
			
		default:
			System.out.println("酒公巴档 酒丛");
			break;
		
		}
		
		System.out.println(today);
		
	}
	


}
