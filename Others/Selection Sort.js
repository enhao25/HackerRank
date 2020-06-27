const numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];

// Time Complexity = O(n^2) | Space Complexity = O(1)
function selectionSort(array) {
  const length = array.length;
  
  // Loop through and find the smallest value and put into the first position not fixed (defined as i).
  for (let i=0; i < length; i++) {
    let minIndex = i;
    for (let j = i + 1; j < length; j++) {
      if (array[j] < array[minIndex]) {
        minIndex = j
      }
    }
    let temp = array[i]
    array[i] = array[minIndex];
    array[minIndex] = temp;
  }
  return array;
}

selectionSort(numbers);