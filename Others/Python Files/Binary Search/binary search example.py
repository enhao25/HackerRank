var doSearch = function(array, targetValue) {
	var min = 0;
	var max = array.length - 1;
    var guess;
    var guessno=1;
    while(max >= min){
        guess = Math.floor((max + min)/2);
        if(array[guess]===targetValue){ 
            println("number of guess: " + guessno);
            return guess; 
        }
        else if (array[guess] < targetValue){ min = guess +1; }
        else{ max = guess - 1; }
        guessno += 1;
        println("guess: " + array[guess]);
    }
    


	return -1;
};

var primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97];

var result = doSearch(primes, 50);
println("Found prime at index " + result);

Program.assertEqual(doSearch(primes, 73), 20);
Program.assertEqual(doSearch(primes, 53), 15);
Program.assertEqual(doSearch(primes, 7), 3);