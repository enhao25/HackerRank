// Time Complexity = O(1)
static int pageCount(int n, int p) {
    if (n % 2 == 0) {
        // Last page only has 1 page
        return Math.min(p/2, (n-p+1)/2);
    } else {
        // Last page has 2 page
        return Math.min(p/2, (n-p)/2);
    }
}

// Problem: https://www.hackerrank.com/challenges/drawing-book/problem