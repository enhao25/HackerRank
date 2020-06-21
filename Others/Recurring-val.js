//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

// Time Complexity: O(n)
function firstRecurringCharacter(inputArray) {
  inputTable = {}
  // Loop through the array, if the number already exist as a key, return the number. Else, Use the number as a key with value of 1.
  for(i=0; i < inputArray.length; i++) {
    input = inputArray[i];
    if (inputTable[input]) {
      return input;
    } else {
      inputTable[input] = 1
    }
  }
  return undefined;
}

firstRecurringCharacter([2,5,5,2,3,5,1,2,4])

//Bonus... What if we had this:
// [2,5,5,2,3,5,1,2,4]
// return 5 because the pairs are before 2,2