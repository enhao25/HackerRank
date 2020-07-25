def uniqueValues(aDict):
    values = aDict.values()
    values = list(values)
    new_list = []
    for each_key in list(aDict.keys()):
        if values.count(aDict[each_key]) == 1:
            new_list.append(each_key)
    new_list.sort()
    return new_list


print(uniqueValues({ 0 : '1', 1 :"2", 2 : "3", 3 : '3' }))
