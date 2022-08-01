k = int(input())

a = []
for i in range(6) :
    a.append(input().split())

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