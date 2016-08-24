import java.util.*;
class Target {
  public static void main(String[] args) {
  	Scanner s=new Scanner(System.in);
  	System.out.println("Enter the limit: ");
  	int n=s.nextInt();
  	int[] arr=new int[n];
  	System.out.println("Enter the array elements: ");
  	for(int i=0;i<n;i++){
  		arr[i]=s.nextInt();
  	}
  	int k=1,sum=0;
  	System.out.println("Enter the target: ");
  	int target=s.nextInt();
  	for(int i=0;i<n;i++){
  		for(int j=k;j<n;j++){
  		 sum=arr[i]+arr[j];
  		 if(sum==target){
  		 	System.out.print(arr[i]+" "+arr[j]+" ");
  		 	break;
  		 }
  		}
  		k=k+1;
  	}
   
  }
}
