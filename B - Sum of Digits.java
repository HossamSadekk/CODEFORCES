
import java.util.Scanner;

public class BSumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        long m=0;
        int numOfspels=0;
        if(n.length()==1){System.out.println("0");
        return;}
        
        
        while(n.length()!=1)
        {
            for(int i=0;i<n.length();i++)
            {
                m+=Integer.parseInt(String.valueOf(n.charAt(i)));
            }
            n=String.valueOf(m);
            m=0;
            numOfspels++;
        }
        System.out.println(numOfspels);
    }
    
}
