import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

// Problem: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER start
     *  2. INTEGER end
     *  3. INTEGER k
     */

    public static int beautifulDays(int start, int end, int k) {
        // Write your code here
        int answer = 0;
        
        for (int val = start; val <= end; val++) {
            int reverseVal = getReverse(val);
            int diff = val - reverseVal;
            
            if (diff % k == 0) { answer++; }
        }
        
        return answer;
    }
    
    public static int getReverse(int value) {
        int tempValue = value;
        int tempReverse = 0;
        while (tempValue != 0) {
            int remainder = tempValue % 10;
            tempReverse = tempReverse * 10 + remainder;
            tempValue = tempValue / 10;
        }
        return tempReverse;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
