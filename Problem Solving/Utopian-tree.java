// Complete the utopianTree function below.
// Time Complexity = O(n)
// Space Complexity = O(1)
static int utopianTree(int n) {
    int height = 1;
    // If it is 2nd cycle (i%2 == 0), * 2, else +1
    for (int i = 0; i < n; i++) {
        height = i % 2 == 0 
            ? height * 2
            : height + 1;
    }
    return height;
}

// Problem: https://www.hackerrank.com/challenges/utopian-tree/problem