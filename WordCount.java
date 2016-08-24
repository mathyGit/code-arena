import java.util.*;
class WordCount {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    String s=read.nextLine();
    String[] str=s.split(" ");
    System.out.print(str.length);
  }
}
