
package team;
import java.util.Scanner;
public class Team {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int solve=0;int total=0;
        
        int Problems = input.nextInt();
        int size=Problems*3;
        int [] arr = new int[size];
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=input.nextInt();
       
        for(int j=0;j<3;j++)
       {
           total+=arr[j];
           total+=arr[j++];
       }
       }
        
        System.out.println(""+total);
        
        
        
        
    }
    
}
