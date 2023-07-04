import java.util.Scanner;
import java.util.ArrayList;
public class Test1 {
	public static void main(String []args) {
		
		
//		boolean x = 1<2;
//		System.out.println(x);
	//	System.out.println("안녕"+2);
//	Scanner sc = new Scanner(System.in);
//	
//	String name = sc.next();
//	System.out.println(name);
//	sc.nextLine();//엔터 먹어가기! 이거 없으면 k값에 대입하는 것이 불가능..
//	
//	String k = sc.nextLine();
//	System.out.println(k);

		ArrayList<String> list= new ArrayList<String>();
		list.add("Apple");
		list.add("banana");
		list.add("peach");
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	
	}
}
