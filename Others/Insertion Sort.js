const numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];

// Time Complexity = O(n^2) | Space Complexity = O(1)
function insertionSort(array) {
  for (let i = 0; i < array.length; i++) {
    if (array[i] < array[0]) {
      // Move to the value to the first 
      array.unshift(array.splice(i, 1)[0])
    } else {
      // Find where the number should be
      for (let j = 1; j < array.length; j++) {
        if (array[i] > array[j-1] && array[i] < array[j]) {
          // Move number to the right spot
          array.splice(j, 0, array.splice(i, 1)[0])
        }
      }
    }
  }
}

insertionSort(numbers);
console.log(numbers);