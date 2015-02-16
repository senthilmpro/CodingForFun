import java.awt.List;
import java.io.*;
import java.util.*;

public class H {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileReader reader = new FileReader("H.txt");
		Scanner scanner = new Scanner(reader);
		int numOfLines = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=0;i< numOfLines ; i++)
		{
			String s = scanner.nextLine();
			String[] spliter = s.split(" ");
			String lineNumber = spliter[0].toString();
			int power = Integer.parseInt(spliter[1].toString());
			int count = 0;
			for(int j=0; j< Math.pow(10, power); j++)
			{
			
					int tempNum = getDigit(j);
					if(tempNum !=-1)
						count++;
				
			}
			System.out.println(lineNumber+ " "+ count);
		}
		scanner.close();
		
	}
	
	static int getDigit(int myInteger)
	{
	  Boolean nonDecreasing = true;
	  String strInteger = String.valueOf(myInteger);
	  char[] intArray = strInteger.toCharArray();
	  
	  for(int i=0; i< intArray.length - 1; i++)
	  {
		  int currentInt = Character.getNumericValue(intArray[i]);
		  int nextInt = Character.getNumericValue(intArray[i+1]);
		  if((nextInt < currentInt))
		  {
			  //System.out.println("broken");
			  nonDecreasing = false;
			  break;
		  }
	  }
	  if(nonDecreasing)
		  return myInteger;
	  else
		  return -1;
	}

}
