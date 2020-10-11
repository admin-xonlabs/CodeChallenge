
public class CodeChallenge1 {

	public static void traverse(int[][] arr)
	{
	 int x,y;

	    int len=5;

	    for(int i=0;i<len;i++)

	    {

	        if(i%2==0)

	        {

	         x=i;

	         y=0;

	       

	        while(x>=0 && y<=i)

	        {

	           System.out.println(arr[x][y]);

	           x-=1;

	           y+=1;
	        }

	        }

	        else

	        {

	            x=0;

	            y=i;

	            while(x<=i && y>=0)

	            {

	                System.out.println(arr[x][y]);

	                x+=1;

	                y-=1;

	            }

	        }

	    }



   if(len%2==0)

	        {

	            for(int i=1;i<=len;i++)

	            {

	                if(i%2 !=0){

	                x=len-1;

	                y=i;

	                while(x>=i && y<=len-1)

	                {

	                    System.out.println(arr[x][y]);

	                    x--;

	                    y++;

	                }

	                }

	                else

	                {

	                    x=i;

	                    y=len-1;

	                    while(x<=len-1 && y>=i)

	                    {

	                       System.out.println(arr[x][y]);

	                       x++;

	                       y--;

	                    }

	                }

	            }

	            

	        }

	        else

	        {

	            for(int i=1;i<=len;i++)

	            {

	                if(i%2 !=0){

	                x=i;

	                y=len-1;

	                while(x<=len-1 && y>=i)

	                {

	                    System.out.println(arr[x][y]);

	                    x++;

	                    y--;

	                }

	                }

	                else

	                {

	                    x=len-1;

	                    y=i;

	                    while(x>=i && y<=len-1)

	                    {

	                       System.out.println(arr[x][y]);

	                       x--;

	                       y++;

	                    }

	                }

	            }

	        }
		
		
	}

	public static void main(String[] args) {

		int[][] mat = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
						};
		
		traverse(mat);
		
	}

}
