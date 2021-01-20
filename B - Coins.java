import java.util.Scanner;

public class BCoins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String [] arr = new String[3];
        int A=0;
        int B=0;
        int C=0;
        char greaterThan='>';
        char smallerThan='<';

        for (int i = 0; i < 3; i++) {
            String s=in.next();
            if(s.charAt(0)=='A' && s.charAt(1)==greaterThan && s.charAt(2)=='B' )
            {
                A++;
            }
            else if(s.charAt(0)=='A' && s.charAt(1)==smallerThan && s.charAt(2)=='B')
            {
                B++;
            }
            if(s.charAt(0)=='B' && s.charAt(1)==greaterThan && s.charAt(2)=='A' )
            {
                B++;
            }
            else if(s.charAt(0)=='B' && s.charAt(1)==smallerThan && s.charAt(2)=='A')
            {
                A++;
            }
            
            
            
            
            
            
            if(s.charAt(0)=='C' && s.charAt(1)==greaterThan && s.charAt(2)=='B' )
            {
                C++;
            }
            else if(s.charAt(0)=='C' && s.charAt(1)==smallerThan && s.charAt(2)=='B')
            {
                B++;
            }
            if(s.charAt(0)=='B' && s.charAt(1)==greaterThan && s.charAt(2)=='C' )
            {
                B++;
            }
            else if(s.charAt(0)=='B' && s.charAt(1)==smallerThan && s.charAt(2)=='C')
            {
                C++;
            }
            
            
            
            
            if(s.charAt(0)=='A' && s.charAt(1)==greaterThan && s.charAt(2)=='C' )
            {
                A++;
            }
            else if(s.charAt(0)=='A' && s.charAt(1)==smallerThan && s.charAt(2)=='C')
            {
                C++;
            }
            if(s.charAt(0)=='C' && s.charAt(1)==greaterThan && s.charAt(2)=='A' )
            {
                C++;
            }
            else if(s.charAt(0)=='C' && s.charAt(1)==smallerThan && s.charAt(2)=='A')
            {
                A++;
            }
            
        }
        if(A==B || B==C )
        {
            System.out.println("Impossible");
        }
        else
        {
            for (int i = 0; i < 3; i++) {
                if(A==i)
                {
                    System.out.print("A");
                }
                else if(B==i)
                {
                    System.out.print("B");
                }
                else
                {
                    System.out.print("C");
                }
                
            }
            
        }
            
    }
    
}
