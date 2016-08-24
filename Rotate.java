import java.util.*;
class Rotate {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the limit: ");
    int n=s.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    System.out.println("Enter the k value: ");
    int k=s.nextInt(),j=0;
    System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++){
    	if(i<=k){
    	a[i]=s.nextInt();
    	j=k+i;
    	b[j]=a[i];}
    	if(i>k){
    		a[i]=s.nextInt();
    		j=i-(k+1);
    		b[j]=a[i];
    	}
    }
    System.out.println("The rearranged array is: ");
    for(int i=0;i<n;i++){
    	System.out.print(b[i]);
    }
    
    
  }
}
