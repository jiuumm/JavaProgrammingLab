class Dice{
	String name;
	private int face;//getValue()와 setValue()가 있는 것으로 보아 
	//face는 private형임을 알 수 있다.
	

	public Dice(String name,int face) {
		this.name =name;
		this.face=face;
	}
	int roll() {
		this.face =(int) (Math.random()*10%6)+1;
		//this.face =(int) Math.random()*10%6+1; 과의 차이점 알아두기!
		
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
		Dice dice1 = new Dice("주사위1", 0);
		Dice dice2 = new Dice("주사위2", 0);
	
		int count=0;
		
		while(true) {
			dice1.roll();
			dice2.roll();
			System.out.print(dice1.toString()+" ");
			System.out.print(dice2.toString());
			count++;
			if(dice1.getValue()==1&&dice2.getValue()==1) {
				
				System.out.println("");
				System.out.println("(1,1)이 나오는데 걸린 횟수 = "+count);
				break;
			}
			System.out.println("");
		}
	

	}

}
