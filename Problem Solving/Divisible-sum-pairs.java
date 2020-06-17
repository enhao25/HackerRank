// Complete the divisibleSumPairs function below.
// Time Comeplxity = O(n)
static int divisibleSumPairs(int n, int k, int[] ar) {
    // Intialize array (Max size of k needed as we are putting in based on the % of k) and count
    int[] moduArray = new int[k];
    int count = 0;

    // Loop through the array
    for (int val: ar) {
        // Modular of val against k
        int modu = val % k;
        // Get (k-modu) % k which is the mod number we need to ensure that when val pairs with the number, it is %k. (Eg. modu of 1 needs mod of 4 (4/8/12) if k =5) 
        // If there exist a number in our array with the respective mod, add the counter
        count += moduArray[(k - modu) % k];
        // Add 1 for further use
        moduArray[modu]++;
    }
    return count;

}

// Problem: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem