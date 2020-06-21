// Complete the sockMerchant function below.
// Time Complexity = O(n)
static int sockMerchant(int n, int[] ar) {
    
    // Intialize
    HashMap<Integer, Integer> socksContainer = new HashMap<Integer, Integer>();
    int socksPairCount = 0;
    
    // Loop through socks
    for (int sock: ar) {
        if (socksContainer.containsKey(sock)) {
            // If hashmap contains the sock, delete it away and add 1 to count
            socksContainer.remove(sock);
            socksPairCount++;
        } else {
            // Else, add the sock with value of 1
            socksContainer.put(sock, 1);
        }
    }
    return socksPairCount;
}

// Problem: https://www.hackerrank.com/challenges/sock-merchant/problem