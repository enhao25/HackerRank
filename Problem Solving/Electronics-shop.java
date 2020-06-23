//  Time Complexity = O(n*m)
static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    
    int maxValue = -1; // temp max value, will be -1 if no combination is within budget

    // Loop through keyboard and drive, if its cost is within budget and greater than current maxValue, replace it
    for (int keyboard: keyboards) {
        for (int drive: drives) {
            int totalCost = keyboard + drive;
            if (totalCost <= b && totalCost > maxValue) {
                maxValue = totalCost;
            }
        }
    }
    return maxValue;
}

// Problem: https://www.hackerrank.com/challenges/electronics-shop/problem