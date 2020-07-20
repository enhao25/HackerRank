// Time Complexity = O(n) where n is the length of the string
// Space Complexity = O(1), only space I need is the maxValue integer
static int designerPdfViewer(int[] h, String word) {
    int maxValue = 0;
    // Loop through the word string and get char by char
    for(char c : word.toCharArray()) {
        // Convert the char to ascii value and then change to the appropriate index by - 97
        int charIndex = (int) c - 97;
        
        // Get the largest height among the string 
        if (maxValue < h[charIndex]) {
            maxValue = h[charIndex];
        }
    }
    // Area = maxValue * word.length()
    return maxValue * word.length();
}

// Problem: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem