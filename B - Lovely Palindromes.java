
package b.lovely.palindromes;
import java.util.*;
public class BLovelyPalindromes {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String palindromes = in.next();
    char [] reflect = palindromes.toCharArray();
    String n = "";
        for (int i = reflect.length-1; i>=0; i--) {
           n+=reflect[i];
        }
        System.out.println(palindromes+n);
        
    }
    
}
