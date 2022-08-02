k = int(input())

a = []
b = []
c = []
count = 6
for i in range(count) :
    a.append(input().split())
    
for i in range(count) :
    for j in range(i + 1, count) :
        if (a[i][0] == a[j][0] and int(a[i][1]) < int(a[j][1])) :
            b.append(a[i])
            break

        elif (a[i][0] == a[j][0] and int(a[i][1]) >= int(a[j][1])) :
            b.append(a[j])
            break


for i in range(6) :
    if (a[i][0] != b[0][0] and a[i][0] != b[1][0]) :
        c.append(a[i])
        
print(a)
print(b)
print(c)
tmp = int(c[0][1]) * int(c[1][1]) - int(b[0][1]) * int(b[1][1])

print(tmp * k)

'''
for i in range(5) :
    if (a[i][0] == '4' and a[i + 1][0] == '1') :
        check = 1
        tmp = int(a[i][1]) * int(a[i + 1][1])
        break
    elif (a[i][0] == '1' and a[i + 1][0] == '3') :
        check = 2
        tmp = int(a[i][1]) * int(a[i + 1][1])
        break
    elif (a[i][0] == '3' and a[i + 1][0] == '2') :
        check = 3
        tmp = int(a[i][1]) * int(a[i + 1][1])
        break
    elif (a[i][0] == '2' and a[i + 1][0] == '4') :
        check = 4
        tmp = int(a[i][1]) * int(a[i + 1][1])
        break
    else :
        check = 0
        tmp = 0

for i in range(5) :
    if (check == 1 and a[i][0] == '2') :
        answer = int(a[i][1]) * int(a[i + 1][1]) - tmp
        break
    elif (check == 2 and a[i][0] == '4') :
        answer = int(a[i][1]) * int(a[i + 1][1]) - tmp
        break
    elif (check == 3 and a[i][0] == '1') :
        answer = int(a[i][1]) * int(a[i + 1][1]) - tmp
        break
    elif (check == 4 and a[i][0] == '3') :
        answer = int(a[i][1]) * int(a[i + 1][1]) - tmp
        break
    else :
        answer = 0

print(answer * k)
'''