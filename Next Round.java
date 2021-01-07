
package next.round;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
    Scanner in = new  Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int [] arr = new int[n];
    int count=0;
    int participant = k-1;
    for (int i = 0; i <arr.length; i++) 
    {
        arr[i]=in.nextInt();
    }
    for (int i = 0; i <arr.length; i++) 
    {
        if(arr[i]>=arr[participant] && arr[i]!=0)
        {
            count++;
        }
    }
        System.out.println(count);
    
    
    
    }
    
}
