// Complete the birthdayCakeCandles function below.
static int birthdayCakeCandles(int[] ar) {
    // Initialize max value (Given small number to start) and count
    int max = -999;
    int count = 1;

    // Time Complexity: O(n)
    // Loop through the array, if the number is bigger than the stored max value, replaces it and change the count to 1
    // Else if the max value is the same as the number, add 1 to the count
    for (int num: ar) {
        if (num > max) {
            max = num;
            count = 1;
        } else if (num == max) {
            count++;
        }
        // Do nothing in the loop if neither
    }
    return count;
}

// Problem: https://www.hackerrank.com/challenges/birthday-cake-candles/problem