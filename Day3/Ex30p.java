import java.util.Scanner;
public class Ex30p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int program = (int)(Math.random()*100);
		int answer=-1;
		int count=0;
		while(answer!=program) {
			System.out.println("������ �����Ͽ� ���ÿ�: ");
			answer = scanner.nextInt();
			count++;
			if(answer<program) System.out.println("������ ������ �����ϴ�.");
			else if (answer>program)System.out.println("������ ������ �����ϴ�.");
			else System.out.println("�����մϴ�. �õ�Ƚ�� = "+count);
			
		}
	}

}
