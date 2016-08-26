import java.util.*;
class MinNum {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number: ");
    String str=s.nextLine();
    char[] a=str.toCharArray();
    Arrays.sort(a);
    System.out.print("Enter the K value:");
    int K=Integer.parseInt(s.nextLine());
    for(int i=0;i<a.length-K;i++){
    	System.out.print(a[i]);
    }
    }
}
