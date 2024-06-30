package homeAssignment2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,3,2,6,5,7}, num=1;
		Arrays.sort(a);
		for (int i = 0; i <a.length; i++) {
			if(a[i]!=num)
			{
				System.out.println(num);
	               break;
			
			}
			else
			{
				num++;
			}
		}

	}

}
