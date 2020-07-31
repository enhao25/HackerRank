// Complete the saveThePrisoner function below.
// Time Complexity = O(1)
// Space Complexity = O(1)
static int saveThePrisoner(int n, int m, int s) {
    int remainder = (m - 1) % n; // Remainder after passing x number of rounds
    int tempAnswer = s + remainder; // Answer if we do not need to start from the start again
    // If tempAnswer > n, we need to start from the s and continue giving the candy, if not, tempAnswer is the answer
    return tempAnswer > n ? tempAnswer - n : tempAnswer;
}

// Problem: https://www.hackerrank.com/challenges/save-the-prisoner/problem