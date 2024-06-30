package homeAssignment2;

public class IsPrime {
	public static void main(String[] args) {
		int n=9, count= 0;
		for (int i = 2; i <=n; i++) {
			if(n % i == 0)
			{
				count++;
			}
		}
			
			if(count>1)
				{
				System.out.println("Not a prime number");
				
			}
				else {
					System.out.println("Is a prime number");
					
				}
			}
		
	}


