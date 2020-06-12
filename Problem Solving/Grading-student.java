/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

// Time Complexity = O(n)
public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    // Start the index to +1 everytimes it loops
    int index = 0;
    for (Integer grade: grades ) {
        // If it satisfy both conditions as stated in the question, update the grades arraylist, else continue looping through
        int diff = 5 - grade%5;
        if (diff < 3 && grade >= 38) {
            grades.set(index, grade + diff);
        }
        index++;
    }
    return grades;
}

// Problem: https://www.hackerrank.com/challenges/grading/problem