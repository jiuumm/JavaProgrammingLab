
//������ �迭 �����!
class SafeArray {
	//�ʵ�
	private int a[];
	public int length;
	
	//������-> ����: �ʱ�ȭ
	public SafeArray(int size) {
		a= new int[size];
		length = size;
		
	}
	
	//get �޼���
	public int get(int index) {
		if(index>=0 && index<length) {
			return a[index];
		}
		return -1;
		
	}
	
	//put �޼���
	public void put(int index, int value) {
		if(index>=0&& index<length) {
			a[index]=value;
			
		}
		else
			System.out.println("�߸��� �ε��� "+index);
		
	}


}

public class SafeArrayTest {// Ŭ���� SafeArray�� �����ϴ� ����!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeArray array= new SafeArray(3);
		//�Ϻη� array�� ������ �ʰ��ؼ� for���� �ۼ��Ͽ� put�޼����� ������ Ȯ���Ѵ�.
		
		for(int i=0; i<array.length+1; i++) {
			array.put(i, i*10);//�ε���=3�̸� array�� ������ ����Ƿ� �߸��� �ε����� ���!
		}
	}
}
