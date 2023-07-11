
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []intArray = new int[5];
		intArray[0]=0;
		try {
		
			for(int i=0; i<5; i++) {
				intArray[i+1]= i+1+intArray[i];
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("¹è¿­ ÀÎµ¦½º ¹üÀ§ ¹þ¾î³²");
		}
		
	}

}
