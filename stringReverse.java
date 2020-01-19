import java.util.Scanner;
public class stringReverse {

	   public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   String str=sc.next();
		   String[] words = str.split("[.]");
			String a = "";
			for (int i = words.length-1; i >= 0; i--)
		        {
		           String word = words[i]; 
		          	      
			   a = a + word +".";
			}
			for(int i=0;i<a.length()-1;i++)
			System.out.print(a.charAt(i));
		   }
	   }


