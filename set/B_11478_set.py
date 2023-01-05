string = input()

a = []

for i in range(len(string)) :
    tmp = string[i]
    for j in range(i + 1, len(string)) :
        a.append(tmp)
        tmp += string[j]
    a.append(tmp)
print(len(set(a)))
