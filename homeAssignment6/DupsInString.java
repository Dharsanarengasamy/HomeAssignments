package homeAssignment6;

public class DupsInString {

	public static void main(String[] args) {
		
	  String input ="We learn Java basics as part of Java sessions in Java week1";
	  System.out.println("Before removing duplicates: "+ input);
	  String[] words = input.split(" ");
	  
	  
	  
	  int count=0;
	  for(int i=0; i<words.length; i++)
		  
	  {
		  //System.out.println(words[i]);
		  for (int j = i+1; j < words.length; j++) 
		  {
			  //System.out.println(words[j]); 
			if(words[i].equals(words[j]))
			{
				 String change = words[i].replace(words[i], " ");
				 count++;
				//System.out.println(words[i]);
				
		
		}
	  }
	  String str = words.toString();
	  if(count>1) {
	 System.out.println("After removing duplicates: "+ str); 

	}
	}
	}
}
