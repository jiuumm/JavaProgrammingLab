
public class ArrayParameterEx {

	//�迭�� ���� �� �ּڰ��� ã�� �޼���!
	static double minArray(double[]lst) {
		double min=lst[0];
		for(int i=0; i<lst.length; i++) {
			if(min>lst[i])
				min=lst[i];
		}
		return min;
	}
	static double maxArray(double[]lst) {
		double max=lst[0];
		//���ʴ�� �� ������ ���ϴ� ���
		for(int i=0; i<lst.length; i++) {
			if(max<lst[i])
					max=lst[i];
		}
		return max;
	}
	//������ ��ǥ�� �ٲ۴�.
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==' ')
				a[i]=',';
		}
		
	}
	// char �迭�� ��� ���ҵ��� �����Ѵ�.
	static void printCharArray(char a[]) {
		for (int i=0; i<a.length; i++) 
			System.out.print(a[i]);
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		
		System.out.println("========================");
		double []a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
		double[]b = {-2.0, 3.0, -9.0, 2.9, 1.5};
		System.out.println(minArray(a));
		System.out.println(maxArray(a));
		System.out.println();
		System.out.println(minArray(b));
		System.out.println(maxArray(b));

	}

}
