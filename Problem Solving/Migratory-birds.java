// Complete the migratoryBirds function below.
// Time complexity = O(n)
static int migratoryBirds(List<Integer> arr) {
    // Loop through the array and find the frequency base on bird type
    HashMap<Integer, Integer> birdCount = new HashMap<Integer, Integer>();
    for (int val: arr) {
        if (birdCount.containsKey(val)) {
            birdCount.replace(val, birdCount.get(val) + 1);
        } else {
            birdCount.put(val, 1);
        }
    }
    // Thereafter, loop through the birdCount and find the most common bird with the smallest ID
    return findMaxType(birdCount);
}

// Time Complexity = O(n)
static int findMaxType(HashMap<Integer, Integer> birdCount) {
    int maxValue = 0;
    int maxType = 0;

    for (Map.Entry entry : birdCount.entrySet()) { 
        if ( (int) entry.getValue() > maxValue) {
            maxValue = (int) entry.getValue();
            maxType = (int) entry.getKey();
        }
    }
    return maxType;
}

// Problem: https://www.hackerrank.com/challenges/migratory-birds/problem