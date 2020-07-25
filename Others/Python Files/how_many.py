def how_many(aDict):
    count = 0
    values = aDict.values()
    for each_value in values:
        count += len(each_value)
    return count


animals = { 'a': ['aardvark'], 'b': ['baboon'], 'c': ['coati']}

animals['d'] = ['donkey']
animals['d'].append('dog')
animals['d'].append('dingo')

print(how_many(animals))
