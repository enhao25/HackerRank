// Complete the countApplesAndOranges function below.
// Time Complexity = O(n)
static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    // Initalize value for counting
    int appleInsideCount = 0;
    int orangeInsideCount = 0;
    
    // Calculate apple position & check if it is between s and t
    for (int apple : apples) {
        if (apple + a >= s && apple + a <= t) {
            // If between s and t, add 1 to count
            appleInsideCount++;
        }
    }
    // Calculate orange position & check if it is between s and t
    for (int orange : oranges) {
        if (orange + b >= s && orange + b <= t) {
            // If between s and t, add 1 to count
            orangeInsideCount++;
        }
    }
    System.out.println(appleInsideCount);
    System.out.println(orangeInsideCount);
}

// Problem: https://www.hackerrank.com/challenges/apple-and-orange/problem