// Time Complexity = O(n)
public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int counter = 0;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 

    // Loop through a and return a map where key is the number, value is the number of occurance of the number
    for(int i = 0; i < a.size(); i++) {
        int key = a.get(i);
        
        // Check if the map contains the key
        if(map.containsKey(key)) {
            // Increase the key's value by 1
            map.put(key, map.get(key) + 1);
        } else {
            // Intialise the key with a value of 1
            map.put(key, 1);
        }
    }

    // Loop through the map and return the largest value
    for(Integer i : map.keySet()) {
        // Value to be its current value count and value + 1 count if it exist
        int value = map.get(i+1) != null 
            ? map.get(i) + map.get(i+1) 
            : map.get(i);
        // Generate largest counter value
        if(value > counter)
            counter = value;
    }
    return counter;
}

// Problem: https://www.hackerrank.com/challenges/picking-numbers/problem