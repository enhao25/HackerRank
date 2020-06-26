// Complete the formingMagicSquare function below.
// Time Complexity: O(n^2) / O(1) -> O(1) in the sense that the number of possible 3x3 square is a constant, hence time complexity won't change
static int formingMagicSquare(int[][] s) {
    int[][] possibleSquares = new int[][] {
        {8, 3, 4, 1, 5, 9, 6, 7, 2},
        {4, 9, 2, 3, 5, 7, 8, 1, 6},
        {2, 7, 6, 9, 5, 1, 4, 3, 8},
        {6, 1, 8, 7, 5, 3, 2, 9, 4},
        {6, 7, 2, 1, 5, 9, 8, 3, 4},
        {8, 1, 6, 3, 5, 7, 4, 9, 2},
        {4, 3, 8, 9, 5, 1, 2, 7, 6},
        {2, 9, 4, 7, 5, 3, 6, 1, 8}
    };
    // Initialize the min malve to be a default max value to be replace later
    int minValue = Integer.MAX_VALUE;

    // Loop through the possibleSquares for each row
    for (int i = 0; i < possibleSquares.length; i++) {
        int total = 0;
        // For each row, loop through each value and and check if the existing s where to be transform to the current row, what would be the cost
        for (int j = 0; j < possibleSquares[i].length; j++) {
            total += Math.abs(s[j/3][j%3] - possibleSquares[i][j]);
        }
        // Ultimately, find the final cost to be minValue and return it
        if (total < minValue) minValue = total; 
    }
    return minValue;
}

// Problem: https://www.hackerrank.com/challenges/magic-square-forming/problem