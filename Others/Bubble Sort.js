const numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];

// Time Complexity = O(n^2)
// Space Complexity = O(1)
function bubbleSort(array) {
  let arrayLength = array.length;
  for (let i = 0; i < arrayLength; i++) {
    for (let j = 0; j < arrayLength - i; j++) {
      if (array[j] > array[j + 1]) {
        temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
      }
    }
  }
}

bubbleSort(numbers);
console.log(numbers);