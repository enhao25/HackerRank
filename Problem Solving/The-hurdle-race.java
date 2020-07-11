// Complete the hurdleRace function below.
// Time Complexity = O(n) | Space Complexity = O(1)
static int hurdleRace(int k, int[] height) {
    
    // Find max height
    int maxHeight = 0;
    for (int h: height) {
        if (h > maxHeight) 
            maxHeight = h;
    }

    // Return appropriate values
    if (maxHeight > k) {
        // Return the difference
        return (maxHeight - k);
    }
    // Since the person can jump all the hurdles without drinking
    return 0;
}

// Problem: https://www.hackerrank.com/challenges/the-hurdle-race/problem