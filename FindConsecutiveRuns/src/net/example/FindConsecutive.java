package net.example;

import java.util.ArrayList;

public class FindConsecutive {

	public static void main(String[] args) {
		int [] testArray ={1, 2, 3, 5, 10, 9, 8, 9, 10, 11, 7};
		ArrayList<Integer> result=findindex(testArray);
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
	
	public static ArrayList<Integer> findindex(int [] aArray)
	{
		int countincrease=0;
		int countindecrease=0;
		ArrayList <Integer> result=new ArrayList <Integer>();
		if(aArray==null)
			return result;
		for(int i=1;i<aArray.length;i++)
		{
			if(aArray[i]-1==aArray[i-1])
			{
				countincrease++;
				countindecrease=0;
			}
			else if(aArray[i]+1==aArray[i-1])
			{
				countindecrease++;
				countincrease=0;
			}
			
			else
			{
				countincrease=0;
				countindecrease=0;
				continue;
			}
			
			if(countincrease>=2)
			{
				result.add(i-2);
				
				
			}
			else if(countindecrease>=2)
			{
				result.add(i-2);
				
			}
		}
		return result;
		
	}

}
