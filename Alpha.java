import java.util.*;
class Alpha{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str=s.nextLine();
    String str1=str.substring(0,str.length()-1);
    char[] a=str1.toCharArray();
    int ab=97;
    String str2=str.substring(str.length()-1,str.length());
    for(int i=0;i<str1.length();i++){
    	if((int)a[i]==ab){
    		a[i]='z';
    	}
    	else{
        int n=(int)a[i]-1;
        a[i]=(char)n;
    	}
    	System.out.print(a[i]);
    }
   System.out.print(str2);
    
    }
}
