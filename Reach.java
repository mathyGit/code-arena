import java.util.*;
class Reach {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the array length: ");
    int n=s.nextInt();
    int jump=0,count=0;
    int[] arr=new int[n];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++){
    	arr[i]=s.nextInt();
    }
    jump=arr[0];
    int i=0;
    while(i<=(n-1)){
    	if(i<(n-1)){
          jump=arr[i];
          i=i+jump;
          count++;
    	}
        if(i==(n-1)){
        	System.out.print("True");
        	break;
        }
        if(count>n){
        	System.out.print("False");
        	break;
        }
       }
        
  }
}
