import java.util.*;

class Pangram {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the String: ");
    String str=s.nextLine();
    String str1=str.replaceAll(" ","");
    char[] a=str1.toCharArray();
    Set<Character> set=new TreeSet<Character>();
    for(int i=0;i<a.length;i++){
    	set.add(a[i]);
    }
    if(set.size()==26){
    	System.out.print("It is a pangram");
    }
    else{
    	System.out.print("It is not a pangram");
    }
  }
}
