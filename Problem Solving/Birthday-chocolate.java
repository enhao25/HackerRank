// Complete the birthday function below.
// Time Complexity = O(m + s)
static int birthday(List<Integer> s, int d, int m) {
    int currentSum = 0, answer=0;

    // Create the first sum base on m
    for(int i=0;i<m;i++) {
        currentSum += s.get(i);
    }

    // If it is == d, add 1 to answer
    if (currentSum==d) answer++;
    
    // Loop through, remove the first val that makes up currentSum and then add next value that have yet to be added before
    // If it is == d, add 1 to answer
    for (int i=0;i<s.size()-m;i++) {
        currentSum = currentSum - s.get(i) + s.get(i+m);
        if (currentSum==d) answer++;
    }
    return answer;
}

// Problem: https://www.hackerrank.com/challenges/the-birthday-bar/problem