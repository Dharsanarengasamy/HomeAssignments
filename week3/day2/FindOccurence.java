package week3.day2;

public class FindOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "Testleaf";
		int count =0;
		char[] inputArray = input.toCharArray();
		for(int i=0;i<inputArray.length; i++)
		{
			if(inputArray[i] == 'e')
			{
		      count++;
			}
		}
		System.out.println("The number of 'e' in the string 'Testleaft' is "+count);
		

	}

}
