import java.util.*;
class MidSum {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the array size:");
    int N=s.nextInt();
    int sum=0;
    int[][] arr=new int[N][N];
    System.out.println("enter the array elements: ");
    for(int i=0;i<N;i++){
    	for(int j=0;j<N;j++){
    		arr[i][j]=s.nextInt();
    		if(i==j){
    			sum=sum+arr[i][j];
    		}
    	}
    }
    System.out.print(sum);
  }
}
