package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String test = "I am a software tester"; 
		
		String[] split = test.split(" ");
		
		for(int i=0;i<split.length-1;i++)
		{
			
//			System.out.println(split[i]);
			
		if(i%2!=0)
		{
			String[] split2 = test.split(split[i]);
			
			for (int j=1;j<=split2.length-1;j++)
			{
				
				System.out.print(split2[j]);
				
			}
			
		}
		}
		

	}

}
