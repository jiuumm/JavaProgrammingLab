class Dice{
	String name;
	private int face;//getValue()�� setValue()�� �ִ� ������ ���� 
	//face�� private������ �� �� �ִ�.
	

	public Dice(String name,int face) {
		this.name =name;
		this.face=face;
	}
	int roll() {
		this.face =(int) (Math.random()*10%6)+1;
		//this.face =(int) Math.random()*10%6+1; ���� ������ �˾Ƶα�!
		
		return face;
	}
	int getValue() {
		return this.face;
	}
	void setValue(int val) {
		
		this.face = val;
	}
	public String toString() {
		return this.name+"= "+this.face;
	}

}
public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice1 = new Dice("�ֻ���1", 0);
		Dice dice2 = new Dice("�ֻ���2", 0);
	
		int count=0;
		
		while(true) {
			dice1.roll();
			dice2.roll();
			System.out.print(dice1.toString()+" ");
			System.out.print(dice2.toString());
			count++;
			if(dice1.getValue()==1&&dice2.getValue()==1) {
				
				System.out.println("");
				System.out.println("(1,1)�� �����µ� �ɸ� Ƚ�� = "+count);
				break;
			}
			System.out.println("");
		}
	

	}

}
