// Complete the breakingRecords function below.
// Time complexity = O(n)
static int[] breakingRecords(int[] scores) {
    // Intialize current highest and lowest score base on first value 
    int recordMax = scores[0];
    int recordMin = scores[0];
    // Intialize counter for answer
    int breakMax = 0;
    int breakMin = 0;

    // Loop through the array, if the score is higher than the current score, add 1 to recordMax, if score is lower than current Min, add 1 to recordMin 
    for (int score: scores) {
        if (score > recordMax) {
            breakMax++;
            recordMax = score;
        } else if (score < recordMin) {
            breakMin++;
            recordMin = score;
        }
    }
    return new int[] {breakMax, breakMin};
}

// Problem: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem