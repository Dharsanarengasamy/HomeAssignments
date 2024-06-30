package homeAssignment2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
			
		}

	}

}
