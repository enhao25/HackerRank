const numbers = [99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0];

// Time Complexity = O(nlogn) | Space Complexity = O(logn)
function quickSort(array, leftIndex, rightIndex){
  const len = array.length; 
  let pivot;
  let partitionIndex;

  if(leftIndex < rightIndex) {
    pivot = rightIndex;
    partitionIndex = partition(array, pivot, leftIndex, rightIndex);
    
    //sort left and right
    quickSort(array, leftIndex, partitionIndex - 1);
    quickSort(array, partitionIndex + 1, rightIndex);
  }
  return array;
}
   
function partition(array, pivot, leftIndex, rightIndex){
  let pivotValue = array[pivot];
  let partitionIndex = leftIndex;

  for(let i = leftIndex; i < rightIndex; i++) {
    // Check if there is any number smaller than the partition
    if(array[i] < pivotValue){
      // If there is, push them to the left
      swap(array, i, partitionIndex);
      partitionIndex++;
    }
  }
  // Put it at a position where the numbers at the right is greater than the current value
  swap(array, rightIndex, partitionIndex);
  return partitionIndex;
}

function swap(array, firstIndex, secondIndex){
    var temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
}

//Select first and last index as 2nd and 3rd parameters
quickSort(numbers, 0, numbers.length - 1);
console.log(numbers);