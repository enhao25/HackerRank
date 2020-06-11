// Complete the staircase function below.
static void staircase(int n) {
    // Initialize an empty string
    String lineString = "";

    // Time complexity = O(n^2)
    // 1st loop count downwards, 2nd loop count upwards
    for(int i = n-1; i>= 0; i--) {
        for (int c = 0; c < n; c++) {
            // Add # if the current loop is >= 1st loop, else add space 
            if (c >= i) {
                lineString += "#";
            } else {
                lineString += " ";
            }
        }
        // Finally print out the string and then reset the lineString to an empty string and continue with the outer loop
        System.out.println(lineString);
        lineString = "";
    }
}