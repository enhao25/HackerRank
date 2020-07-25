balance = 42
annualInterestRate = 0.2
monthlyPaymentRate = 0.04
count = 0

while count < 12:

    Monthly_payment = balance * monthlyPaymentRate
    Unpaid_value = balance - Monthly_payment
    monthly_int = Unpaid_value * (annualInterestRate/12)
    balance = Unpaid_value + monthly_int
    
    count +=1

print("Remaining balance: " + str(round((balance), 2)))
