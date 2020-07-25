def biggest(aDict):
    values = aDict.values()
    highest = len(max(values))
    for each_key in aDict.keys():
        if len(aDict[each_key]) == highest:
            return each_key
            

animals = { 'a': ['aardvark'], 'b': ['baboon'], 'c': ['coati']}

animals['d'] = ['donkey']
animals['d'].append('dog')
animals['d'].append('dingo')

print(biggest(animals))
