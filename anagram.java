import java.util.Scanner;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter string 1");
     String s=sc.next();	
     System.out.println("enter string 2");
     String sw=sc.next();
     int flag=0;
     String s1=s.toLowerCase();
     String s2=sw.toLowerCase();
     if(s1.length()!=s2.length())
     {
    	 System.out.println("not anagram");
     }
     else {
     for(int i=0;i<s1.length();i++)
     {
    	 for(int j=0;j<s2.length();j++)
    	 {
    		 if(s1.charAt(i)==s2.charAt(j))
    		 {
    			 flag++;
    			 break;
    		 }
    	 }
     }
     if(flag==s1.length())
     {
    	 System.out.println("Anagrams");
     }
     else {
    	 System.out.println("not anagram");
     }
     }
	}

}
