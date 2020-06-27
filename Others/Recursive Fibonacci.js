// Given a number N return the index value of the Fibonacci sequence, where the sequence is:

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3

//For example: fibonacciRecursive(6) should return 8

// Time Complexity = O(n)
function fibonacciIterative(n){
  //code here;
  let current = 1;
  let previous = 0;
  if (n < 2) {
    return 1;
  }
  for (let i = 2; i <= n; i++) {
    current = previous + current;
    previous = current - previous;
  }
  return current;
}
// fibonacciIterative(12);

// Time Complexity = O(2^n)
function fibonacciRecursive(n) {
  if (n < 2) {
    return n;
  } else {
    return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
  }
}

fibonacciRecursive(10)