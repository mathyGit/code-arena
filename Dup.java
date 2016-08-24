import java.util.*;
class Dup {
  public static void main(String[] args) {
  	Scanner s=new Scanner(System.in);
  	System.out.println("Enter the String: ");
  	String str=s.nextLine();
  	Set<Character> st=new TreeSet<Character>();
  	StringBuilder sb=new StringBuilder();
  	for(int i=0;i<str.length();i++){
  		st.add(str.charAt(i));
  	}
  	for(Character c:st){
  	  	sb.append(c);
  	}
  	System.out.print(sb);
  }
}
