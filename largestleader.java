import java.util.Scanner;
public class largestleader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int c=0,k=0,j,m=0;
		int d[]=new int[10];
		for(int i=0;i<n;i++)
		{ 
			c=0;
			m=0;
			for( j=i+1;j<n;j++)
			{
				if(a[i]>=a[j])
				{
				  c++;
				}
				m++;
			}
			if(c==m)
			{
				d[k++]=a[i];
			}
		}
		for(j=0;j<k;j++)
		{
			System.out.print(d[j]+" ");
		}
	}

}
