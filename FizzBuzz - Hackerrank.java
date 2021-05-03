import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
     for (int i =1; i<=n; i++) {
    if(i%3==0 && i%5==0)
    {
        System.out.println("FizzBuzz");
        continue;
    }
    else if(i%3==0){System.out.println("Fizz"); continue;}
    else if(i%5==0){System.out.println("Buzz"); continue;}
    else{System.out.println(i);}
    
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
