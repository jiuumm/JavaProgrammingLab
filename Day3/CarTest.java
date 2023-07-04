
class Car{
	String color;
	int speed;//int형의 초기값=0
	int gear;
	
	public String toString() {
	return "Car [Color : "+color+", Speed: "+speed+", Gear: "+gear+"]";
	
}
	void changeGear(int g) {
		gear  =g;
	}
	
	void speedUp() {
		speed = speed+10;
	}
	
	void speedDown() {
		speed= speed-10;
	}
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		myCar.color = "Red";
		myCar.gear=1;
		myCar.speed=5;
		myCar.speedUp();
		System.out.println(myCar);
	}

}
