# Hangman game
#

# -----------------------------------
# Helper code
# You don't need to understand this helper code,
# but you will have to know how to use the functions
# (so be sure to read the docstrings!)

import random
import string

WORDLIST_FILENAME = "words.txt"

def loadWords():
    """
    Returns a list of valid words. Words are strings of lowercase letters.
    
    Depending on the size of the word list, this function may
    take a while to finish.
    """
    print("Loading word list from file...")
    # inFile: file
    inFile = open(WORDLIST_FILENAME, 'r')
    # line: string
    line = inFile.readline()
    # wordlist: list of strings
    wordlist = line.split()
    print("  ", len(wordlist), "words loaded.")
    return wordlist

def chooseWord(wordlist):
    """
    wordlist (list): list of words (strings)

    Returns a word from wordlist at random
    """
    return random.choice(wordlist)

# end of helper code
# -----------------------------------

def isWordGuessed(secretWord, lettersGuessed):
    '''
    secretWord: string, the word the user is guessing
    lettersGuessed: list, what letters have been guessed so far
    returns: boolean, True if all the letters of secretWord are in lettersGuessed;
      False otherwise
    '''
    # FILL IN YOUR CODE HERE...
    og_list = list(secretWord)
    new_list = []

    for each_letter in og_list:
        if each_letter not in new_list:
            new_list.append(each_letter)
    
    for each_letter in lettersGuessed:
        if each_letter in new_list:
            new_list.remove(each_letter)
    if (len(new_list) == 0):
        return True
    else:
        return False


def getGuessedWord(secretWord, lettersGuessed):
    '''
    secretWord: string, the word the user is guessing
    lettersGuessed: list, what letters have been guessed so far
    returns: string, comprised of letters and underscores that represents
      what letters in secretWord have been guessed so far.
    '''
    # FILL IN YOUR CODE HERE...
    og_list = list(secretWord)
    new_list = []
    count = 0
    
    for each_letter in og_list:
        if each_letter in lettersGuessed:
            new_list.append(each_letter)
        else:
            new_list.append("_")
        count += 1
    return ("".join(new_list))


def getAvailableLetters(lettersGuessed):
    '''
    lettersGuessed: list, what letters have been guessed so far
    returns: string, comprised of letters that represents what letters have not
      yet been guessed.
    '''
    # FILL IN YOUR CODE HERE...
    result = list(string.ascii_lowercase)
    for each_letter in lettersGuessed:
        if each_letter in string.ascii_lowercase:
            result.remove(each_letter)
    return ("".join(result))
    

def hangman(secretWord):
    '''
    secretWord: string, the secret word to guess.

    Starts up an interactive game of Hangman.

    * At the start of the game, let the user know how many 
      letters the secretWord contains.

    * Ask the user to supply one guess (i.e. letter) per round.

    * The user should receive feedback immediately after each guess 
      about whether their guess appears in the computers word.

    * After each round, you should also display to the user the 
      partially guessed word so far, as well as letters that the 
      user has not yet guessed.

    Follows the other limitations detailed in the problem write-up.
    '''
    # FILL IN YOUR CODE HERE...
    guess_left = 8
    guess_list = []
    print("Welcome to the game, Hangman!")
    print("I am thinking of a word that is " + str(len(secretWord)) + " letters long")
    print("-------------")
    
    while guess_left > 0:
        print("You have " + str(guess_left) + " guesses left")
        print("Available letters: " + getAvailableLetters(guess_list))

        guess = input("Please guess a letter: ")

        if guess in guess_list:
            print("Oops! You've already guessed that letter: " + getGuessedWord(secretWord, guess_list))
        elif guess in list(secretWord):
            availableLetters = getAvailableLetters(guess_list)
            guess_list.append(guess)
            print("Good guess: " + getGuessedWord(secretWord, guess_list))
        else:
            guess_left -=1
            guess_list.append(guess)
            print("Oops! That letter is not in my word:" + getGuessedWord(secretWord, guess_list))
        print("-------------")

        if isWordGuessed(secretWord, guess_list):
            print("Congratulations, you won!")
            return
        if guess_left == 0:
            print("Sorry, you ran out of guesses. The word was " + secretWord +".")
            return
            
            

# Load the list of words into the variable wordlist
# so that it can be accessed from anywhere in the program
wordlist = loadWords()

# secretWord = 'apple'
# lettersGuessed = ['e', 'i', 'k', 'p', 'r', 's']
# print(getGuessedWord(secretWord, lettersGuessed))
# print(getAvailableLetters(lettersGuessed))



# When you've completed your hangman function, uncomment these two lines
# and run this file to test! (hint: you might want to pick your own
# secretWord while you're testing)

secretWord = chooseWord(wordlist).lower()
print(hangman(secretWord))
# hangman(secretWord)
