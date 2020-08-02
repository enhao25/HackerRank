// Complete the circularArrayRotation function below.
// Time Complexity = O(n + m)
// Space Complexity = O(n + m)
static int[] circularArrayRotation(int[] arr, int k_rotation, int[] queries) {
    
    int length = arr.length;
    int newArray[] = new int[length]; // Array after rotation

    // Perform Rotation
    for(int i = 0; i < length; i++) {
        // (i + k_rotation) % length gets back the position after rotation (Doesn't matter the number of rotation)
        newArray[(i + k_rotation) % length] = arr[i];
    }

    // Select out the number for queries
    int answer[] = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
        answer[i] = newArray[queries[i]];
    }
    return answer;
}

// Problem: https://www.hackerrank.com/challenges/circular-array-rotation/problem