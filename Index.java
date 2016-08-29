import java.util.*;
class Index{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the N value:");
    int n=sc.nextInt();
    Set<Integer> set=new TreeSet<Integer>();
    System.out.println("Enter the "+n+" elements:");
    for(int i=0;i<n;i++){
    	set.add(sc.nextInt());
    }
    Integer[] num = set.toArray(new Integer[set.size()]);
    for(int i=0;i<num.length;i++){
    	if(i==num[i]){
    		System.out.println(num[i]);
    	}
    }
  }
}
