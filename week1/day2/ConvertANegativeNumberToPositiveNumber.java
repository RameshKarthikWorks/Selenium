package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {
	
	public static void main(String[] args) {
		int number =-40;
		int positive;
		
		if(number<0)
		{
			System.out.println("The number is negative"+" "+number);
			
		}
		
		positive =(-number++);
				System.out.println(positive);
				
	}
	
	

}
