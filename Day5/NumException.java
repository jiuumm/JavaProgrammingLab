
public class NumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strNum = {"23", "12", "3.141592", "998"};
		int i=0;
		for (i=0; i<strNum.length; i++) {
			try {
				
				int j = Integer.parseInt(strNum[i]);
				System.out.println("���ڷ� ��ȯ�� ���� "+j);
		
		}
		catch(NumberFormatException e) {
			System.out.println(strNum[i]+"�� ������ ��ȯ �Ұ���");
			continue;
			}
		}

	}

}
