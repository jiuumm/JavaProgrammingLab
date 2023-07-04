
//안전한 배열 만들기!
class SafeArray {
	//필드
	private int a[];
	public int length;
	
	//생성자-> 역할: 초기화
	public SafeArray(int size) {
		a= new int[size];
		length = size;
		
	}
	
	//get 메서드
	public int get(int index) {
		if(index>=0 && index<length) {
			return a[index];
		}
		return -1;
		
	}
	
	//put 메서드
	public void put(int index, int value) {
		if(index>=0&& index<length) {
			a[index]=value;
			
		}
		else
			System.out.println("잘못된 인덱스 "+index);
		
	}


}

public class SafeArrayTest {// 클래스 SafeArray에 의존하는 관계!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeArray array= new SafeArray(3);
		//일부러 array의 범위를 초과해서 for문을 작성하여 put메서드의 역할을 확인한다.
		
		for(int i=0; i<array.length+1; i++) {
			array.put(i, i*10);//인덱스=3이면 array의 범위를 벗어나므로 잘못된 인덱스를 출력!
		}
	}
}
