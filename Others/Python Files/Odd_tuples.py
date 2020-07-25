def oddTuples(aTup):
    count = 0
    aTup_tup = ()
    while count < len(aTup):
        if (count + 1) % 2 > 0:
            aTup_tup =  aTup_tup + (aTup[count],)
        count += 1
    return aTup_tup
te = ('I', 'am', 'a', 'test', 'tuple')
print(oddTuples(te))
