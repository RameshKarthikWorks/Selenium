package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		int count=0;
		String[] statement = null;
		
		String[] splittext = text.split(" ");
		
	
		
		for (int i=0;i<splittext.length;i++)
		{
			
			for (int j=i+1;j<splittext.length;j++)
			{
				if(splittext[i].equals(splittext[j]))
				{
	
					if(splittext[i].equals(splittext[j]))
					{
						statement =text.split(splittext[i]);
					}
					
					
				}

			}
		}
		for (String string : statement) {
			
			System.out.print(string);
		}

	}

}
