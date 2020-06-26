// Time Complexity = O(n)
function findFactorialRecursive(number) {
  //code here
  if (number <= 1) {
    return 1;
  } else {
    return number * findFactorialRecursive(number - 1);
  }
}

// Time Complexity = O(n)
function findFactorialIterative(number) {
  //code here
  let answer = 1;
  for (let i = number; i > 1; i--) {
    answer *= i
  }
  return answer;
}