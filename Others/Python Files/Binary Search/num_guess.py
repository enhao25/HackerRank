print("Please think of a number between 0 and 100!")
low = 0
high = 100
guess = int((high + low) / 2)
done = 0

while done != 1:
    print("Is your secret number " + str(guess) + "?")
    user_ans = input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly.")
    if  user_ans == "l":
        low = guess

    elif user_ans == "h":
        high = guess

    elif user_ans == "c": 
        done = 1
        print("Game over. Your secret number was: " + str(guess))

    else:
        print("Sorry, I did not understand your input.")

    guess = int((high + low) / 2)
