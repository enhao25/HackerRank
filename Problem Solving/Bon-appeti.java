// Complete the bonAppetit function below.
// Time Complexity = O(n)
static void bonAppetit(List<Integer> bill, int k, int b) {
    // Intialize values
    int totalCost = 0;
    int index = 0;
    // Loop through the bill, if it is k, avoid it, else add it up to the totalCost
    for (int cost: bill) {
        if (index != k) totalCost += cost;
        index++;
    }
    // Then, if the expectedBill = b (billed payed), then print "Bon Appetit", else returns the diff
    int expectedBill = totalCost / 2;
    System.out.println(expectedBill == b 
        ? "Bon Appetit"
        : b - expectedBill);
}

// Problem: https://www.hackerrank.com/challenges/bon-appetit/problem