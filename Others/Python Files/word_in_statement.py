s = 'azcbobob'
temp=0
num_bob = 0
total_occur = len(s) - 2
while (temp <= total_occur):
    if s[temp:temp+3] =="bob":
        num_bob += 1
    temp += 1

print ("Number of times bob occurs is: " + str(num_bob))
        
