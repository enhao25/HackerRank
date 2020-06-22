// Complete the countingValleys function below.
// Time Complexity = O(n)
static int countingValleys(int n, String s) {
    int v = 0;     // # of valleys
    int lvl = 0;   // current level
    // Loop through the characters in s, if "U", up one level, else down one level
    for(char c : s.toCharArray()){
        if(c == 'U') ++lvl;
        if(c == 'D') --lvl;
        
        // if we just came UP to sea level
        if(lvl == 0 && c == 'U')
            ++v;
    }
    return v;
}

//Problem: https://www.hackerrank.com/challenges/counting-valleys/problem