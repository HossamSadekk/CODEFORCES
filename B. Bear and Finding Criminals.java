
package b.bear.and.finding.criminals;
import java.util.Scanner;
public class BBearAndFindingCriminals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int limak = in.nextInt()-1;
        int criminals=0;
        int [] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            int x =0;
            int y=0;
            int z=0;
            x=Math.abs(limak-i);
            y=checkBehind(limak,x);
            z=limak+x;
            if(arr[i]==1 && y>=0 && z<arr.length){
            if(arr[y]==1 && arr[z]==1)
            {
                criminals++;
            }}
            else if(arr[i]==1)
            {
                criminals++;
            }
        }
        System.out.println(criminals);
        
    }
    public static int checkBehind(int limakPosition,int n)
    {
        int a=limakPosition;
        for (int i = 0; i < n; i++) {
            a--;
            
        }
        return a;
    }
    
}
