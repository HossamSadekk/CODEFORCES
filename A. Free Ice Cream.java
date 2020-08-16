
package a.free.ice.cream;
import java.util.Scanner;

public class AFreeIceCream {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    long x = input.nextInt();
    int count=0;
    for(int i=0;i<n;i++)
    {
        char c = input.next().charAt(0);
        int o = input.nextInt();
        if(c=='+')
        {
            x+=o;
        }
        else if(c=='-')
        {
            if(o>x)
            count++;
            else{x-=o;}
        }
    }
    
   System.out.println(x+" "+count);
    
    
    
    
    }
    
}