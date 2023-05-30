package week1.day3;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr ={1,2,3,4,7,6,8};
		
		Arrays.sort(arr); 
		
		int n=0;
		
		for(int i=1;i<=arr.length;i++)
		{
			if(arr[n]!=i)
			{
				System.out.println("Then the missing element of the array is "+i);
			}
			
			else
			{
				n++;
				continue;
			}
		}
		
	
	}
	
	}
