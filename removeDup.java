import java.util.Scanner;
public class removeDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       	char a[]=s.toCharArray();
		char b[]=new char[a.length];
		if(a.length==2)
		{
			System.out.print(s);
		}
		else
		{
			int i=1,j=0;
			while(i<a.length)
		    {
			   if(a[i]!=a[i-1])
			   {
				   b[j++]=a[i-1];
			   }
			   i++;
		    }
		    i--;
		    if(a[i]!=b[j-1])
		    {
			   b[j]=a[i];
		    }
		    System.out.println( String.valueOf(b));	
		}
	
	}
    	     
       }

