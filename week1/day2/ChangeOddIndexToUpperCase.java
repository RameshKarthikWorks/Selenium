package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changename";
		
		char[] arraystring = test.toCharArray();
		
		for(int i=0;i<arraystring.length;i++)
		{
			if(i%2==0)
			{
				arraystring[i] =test.toUpperCase().charAt(i);
			}
			
			else if (!(i%2==0))
			{
				arraystring[i] =test.toLowerCase().charAt(i);
			}
			
			
			
		}
		
		System.out.println(arraystring);
		

	}

}
 