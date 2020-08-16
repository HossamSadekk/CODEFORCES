
package a.brain.s.photos;
import java.util.ArrayList;
import java.util.Scanner;
public class ABrainSPhotos {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    
String [][] c = new String[n][m];
int colorful = 0;
for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
      c[i][j]=in.next();
    }
}

for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
        if(c[i][j].equals("Y") || c[i][j].equals("M")|| c[i][j].equals("C"))
            colorful++;
        else
            continue;
    }
}
String colors  = (colorful>0) ? "#Color" : "#Black&White";
        System.out.println(colors);

    }
    
}