// Complete the kangaroo function below.
// Time complexity = O(1)
static String kangaroo(int x1, int v1, int x2, int v2) {
    // Given the constrait that x2 > x1, if v1 <= v2, x1 will never catch up to x2
    if (v1 > v2) {
        // For the kangaroos to meet, 
        // x1+v1j = x2 + v2j
        // x1 - x2 = j(v2 - v1) 
        // j = (x1-x2) / (v2 - v1)
        // Hence to ensure that j exist, (x1-x2) % (v2-v1) must be = 0
        int remainder = (x1 - x2) % (v2 - v1);

        if (remainder == 0) return "YES";
    }
    return "NO";
}

// Problem: https://www.hackerrank.com/challenges/kangaroo/problem