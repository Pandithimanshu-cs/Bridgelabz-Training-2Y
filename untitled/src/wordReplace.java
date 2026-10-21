
import java.sql.SQLOutput;
import java.util.*;

 public class wordReplace {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String old = sc.nextLine();
        String newword = sc.nextLine();
        String result = sentence.replace(old,newword);
       System.out.println(result);
    }
}
