class Circle{
	int radius;
	public Circle(int r) {
		this.radius = r;
	}
}
public class Test1 {
	
	//�� ����
	static void increase(int m) {
		m=m+1;
	}
	
	//���۷��� ����
	static void increase(Circle m) {
		m.radius++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		increase(n);
		
		System.out.println(n);
		
		System.out.println("--------------------------------");
		
		Circle pizza= new Circle(10);
		increase(pizza);
		System.out.println(pizza.radius);
	}

}
