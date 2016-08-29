import java.util.*;
class Kinder {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the N value:");
    int n=sc.nextInt();
    int k=1;
    for(int i=0;i<2*n;i++){
    	for(int j=k;j<2*n;j++){
    		if(i==j)
    		 continue;
    		else{
    		 System.out.println(i+""+j);	
    		}
    	}k+=1;
    }
    
  }
}
