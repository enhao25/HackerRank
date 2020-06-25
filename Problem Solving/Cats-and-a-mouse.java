// Complete the catAndMouse function below.
// Time Complexity: O(n)
static String catAndMouse(int x, int y, int z) {
    int AtoC = Math.abs(x - z);
    int BtoC = Math.abs(y - z);
    
    if (AtoC < BtoC) {
        // Cat A catches the mouse first
        return "Cat A";
    } else if (AtoC > BtoC) {
        // Cat B catches the mouse first
        return "Cat B";
    } else {
        // Both is same distance away from C
        return "Mouse C";
    }
}

// Problem: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem