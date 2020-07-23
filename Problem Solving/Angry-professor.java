// Complete the angryProfessor function below.
// Time Complexity = O(n)
// Space Complexity = O(1)
static String angryProfessor(int k, int[] a) {
    int onTime = 0; //Counter for people who are on time
    for (int value: a) {
        if (value <= 0){
            // On time
            onTime++;
        }
    }
    // Cancel class ("Yes") only if the required person (k) is greater than the number of people that were on time
    return k > onTime ? "YES" : "NO";  
}

// Problem: https://www.hackerrank.com/challenges/angry-professor/problem