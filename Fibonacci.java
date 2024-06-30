package homeAssignment2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		int x=0, y=1, n=10;
		System.out.println(x);
		System.out.println(y);
		for (int i = x; i < n; i++) {
			int z= x+y;
			System.out.println(z);
		    x=y;
			y=z;
			
		}

	}

}
