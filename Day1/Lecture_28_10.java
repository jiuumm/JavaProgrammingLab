
public class Lecture_28_10 {
	final static double PI = 3.141592;
	public static double area (int r, int n) {
		return PI*r*r*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1 = 20;
		int r2 = 30;
		double a1= area(20,2);
		double a2 = area(30,1);
		System.out.println("20cm 피자 2개의 면적 = "+ a1);
		System.out.println("30cm 피자 면적 = "+a2);
		System.out.println("30cm 피자 한 개를 주문하세요.");
	}

}
