package homeAssignment6;

public class OddIndexToUppercase {
     public static void main(String[] args) {
    	 
		String test= new String("changeme");
		char[] output = test.toCharArray();
		//String c;
		for(int i= output.length -1; i>=0; i--)
		{
			if(i%2 != 0) {
				
			char s1 = Character.toUpperCase(output[i]);
			output[i] = s1;
			
			//System.out.println(s1);
			}
			
		}
		
		String test1= output.toString();
		System.out.println(output);
		
	}
}
