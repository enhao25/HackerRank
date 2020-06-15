// Time Complexity = O(a + b)
public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    // Get LCM of a and GCD of b
    int f = lcm(a);
    int l = gcd(b);
    
    // Count the number of multiples of LCM that evenly divides the GCD
    int count = 0;
    for(int i = f, j =2; i<=l; i=f*j,j++){
        if(l%i==0){ count++;}
    }
    return count;
}

// Function to get gcd
public static int gcd(int x, int y) {
    if (y == 0) {
        return x;
    }
    return gcd(y, x % y);
}

private static int gcd(List<Integer> input) {
    int result = input.get(0);
    for (int i = 1; i < input.size(); i++) {
        result = gcd(result, input.get(i));
    }
    return result;
}

// Function to get lcm
public static int lcm(int x, int y) {
    return (x * y) / gcd(x, y);
}

private static int lcm(List<Integer> input) {
    int result = input.get(0);
    for (int i = 1; i < input.size(); i++) {
        result = lcm(result, input.get(i));
    }
    return result;
}

// Problem: https://www.hackerrank.com/challenges/between-two-sets/problem