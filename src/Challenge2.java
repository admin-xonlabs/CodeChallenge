import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
int count=0,c=0,c1=0,d=0;
  int[] ar = null;
  int i=0;
  Random r=new Random();
  HashSet<Integer> a=new HashSet<Integer>();
  for( i=0;i<10;i++)
  {
  int rr=r.nextInt(9);

  a.add(rr);
  if(a.size()==3)
   break;
  
  }
  
  
  
  Integer[] arr=a.toArray(new Integer [a.size()]);
	
  Scanner s=new Scanner(System.in);
  System.out.println("Note:\n 1.Enter 3 unique digits\n 2.If a number user enters \n \t(a) matched with number and the position then the clue is 'Match'\n \t(b)Did not match any the the clue will be 'None'\n \t(c)number is matched but not the position then the clue will be 'close'\n ==============================================================================================");
	
  System.out.println("Guess the 3 digit Number");
  
  while(c!=3)
  {
   c=0;
   c1=0;
   d=0;
   
  
   String g=s.next();
   count++;
   String[] m=g.split("");
   ar=new int[m.length];
   for(i=0;i<m.length;i++)
   {
    ar[i]=Integer.parseInt(m[i]);
   }
  if(m.length>3 || m.length<3)
  {
   System.err.println("please enter only 3 digit number");
   count--;
  }
  if(m.length==3)
  {
  
  for(i=0;i<m.length;i++)
  {
   if(ar[i]==arr[i])
   {
    c++;
    
    if(c==3)
    {
     System.err.println("Congrats u won the game in "+count+" Attempts");
    }
   }
  }
  
  for(i=0;i<m.length;i++)
  {
   for(int j=0;j<m.length;j++)
   {
    if(i!=j)
    {
     if(ar[i]==ar[j])
     {
      d=1;
     }
    }
   }
  }
  
  
  for(i=0;i<m.length;i++)
  {
   
   
    if(ar[i]==arr[i])
    {
     System.out.println("Match");
     
     
    }
    
   
  }
  
  for(i=0;i<m.length;i++)
  {
   for(int j=0;j<arr.length;j++)
   
    if(ar[i]!=arr[j])
    {
     
     c1++;
    }
    
   
  }
  
	
  if(c1==9)
  {
   System.out.println("None");
  }
	
  
  for(i=0;i<m.length;i++)
  {
   for(int j=arr.length-1;j>=0;j--)
   {
    if(i!=j)
    {
         if(ar[i]==arr[j])
        {
     System.out.println("Close");
        }
        }
        }
  
        }

	}
}
		

	}

}
