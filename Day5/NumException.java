
public class NumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strNum = {"23", "12", "3.141592", "998"};
		int i=0;
		for (i=0; i<strNum.length; i++) {
			try {
				
				int j = Integer.parseInt(strNum[i]);
				System.out.println("숫자로 변환된 값은 "+j);
		
		}
		catch(NumberFormatException e) {
			System.out.println(strNum[i]+"는 정수로 변환 불가능");
			continue;
			}
		}

	}

}
