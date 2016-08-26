import java.util.*;
class Square {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the 4 points: ");
    int[] a=new int[8];
    for(int i=0;i<8;i++){
    	a[i]=Integer.parseInt(s.next());
    }
    int sum1=a[0]+a[2]+a[4]+a[6];
    int sum2=a[1]+a[3]+a[5]+a[7];
    if (sum1==sum2){
       System.out.print("Square");	
    }
    else System.out.print("Not a square");
    
    }
}
