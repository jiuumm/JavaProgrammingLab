import java.util.Scanner;
public class Ex30p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int program = (int)(Math.random()*100);
		int answer=-1;
		int count=0;
		while(answer!=program) {
			System.out.println("정답을 추측하여 보시오: ");
			answer = scanner.nextInt();
			count++;
			if(answer<program) System.out.println("제시한 정수가 낮습니다.");
			else if (answer>program)System.out.println("제시한 정수가 높습니다.");
			else System.out.println("축하합니다. 시도횟수 = "+count);
			
		}
	}

}
