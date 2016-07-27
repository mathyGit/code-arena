import java.util.*;
public class Vowel{

  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    ArrayList<String> list=new ArrayList<String>();
      list.add("a");
      list.add("e");
      list.add("i");
      list.add("o");
      list.add("u");
      if(list.contains(input)){
        System.out.println("It is a vowel");
      }
      else
        System.out.println("It is a consonant");
     }
}
