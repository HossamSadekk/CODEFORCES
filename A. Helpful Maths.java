package a.helpful.maths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AHelpfulMaths {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<Integer>();
    String sum = input.next();
for(int i=0;i<sum.length();i++)
{
    char s = sum.charAt(i);
    if(s!='+')
    {
        a.add(Character.getNumericValue(s));
    }
}   
    Collections.sort(a);
    String s ="";
    for(int i=0;i<a.size();i++)
    {
        s+=a.get(i);
        if(i!=a.size()-1)
        {
            s+="+";
        }
    }
        System.out.println(s);

}
}