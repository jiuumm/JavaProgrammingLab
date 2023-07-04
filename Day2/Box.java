
public class Box {
	double garo;
	double sero;
	double height;
	
	public static double volume(double g, double s, double h) {
		
		return g*s*h;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b= new Box();
		
		b.garo=20.0;
		b.sero = 20.0;
		b.height= 30.0;
		
		double vol = volume(b.garo, b.sero, b.height);
		
		System.out.println("상자의 부피는 "+ vol+"입니다.");

	}

}
