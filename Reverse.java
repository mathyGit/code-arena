import java.util.*;
class Reverse {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String[] s1=s.nextLine().split(" ");
    StringBuilder str=new StringBuilder();
    for(int i=s1.length-1;i>=0;i--){
       str.append(s1[i]+" ");
    }
    System.out.print(str);
    
  }
}
