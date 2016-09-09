import java.util.*;
class Array {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the array size: ");
    int n=s.nextInt();
    int res=0,k=1;
    int[] num=new int[n];
    System.out.println("enter the elements:");
    for(int i=0;i<n;i++){
    	num[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
    	if(res==0){
    	for(int j=k;j<n;j++){
    		if(num[i]==num[j]){
    			System.out.print(num[i]);
    			res=1;
    		}
    	}k++;}
    }
    if(res==0){
    	System.out.print("No such element");
    }
  }
}
