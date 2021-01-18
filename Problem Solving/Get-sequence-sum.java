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

public class Solution {

    // Complete the getSequenceSum function below.
    static long getSequenceSum(int i, int j, int k) {
        long totalSum = 0;
        
        // Change for loop direction depending on whether i or j is greater
        if (i < j) {
            // First loop from i to j
            for (int val = i; val <= j; val++) {
                totalSum += val;
            }
            
            // Second loop from j to k
            for (int val = j - 1; val >= k; val--) {
                totalSum += val;
            }
        } else {
            // First loop from i to j
            for (int val = i; val >= j; val--) {
                totalSum += val;
            }
            
            // Second loop from j to k
            for (int val = j + 1; val <= k; val++) {
                totalSum += val;
            }
        }
        return totalSum;

    }
}