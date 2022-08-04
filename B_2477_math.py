k = int(input())

a = []
b = []
b2 = []
c = []
count = 6
for i in range(count) :
    a.append(input().split())
    
for i in range(count) :
    for j in range(count) :
        if (i != j and a[i][0] == a[j][0] and int(a[i][1]) < int(a[j][1])) :
            b.append(a[i])
            break

        elif (i != j and a[i][0] == a[j][0] and int(a[i][1]) >= int(a[j][1])) :
            b2.append(a[i])
            break

for i in range(6) :
    if (a[i][0] != b[0][0] and a[i][0] != b[1][0]) :
        c.append(a[i])

b_res = int(b[0][1]) * int(b[1][1])
b2_res = int(b2[0][1]) * int(b2[1][1])
c_res = int(c[0][1]) * int(c[1][1])

print(b)
print(b2)
print(c)

if (b[0][1] == a[0][1] and b[1][1] == a[1][1]) :
    print(k * (c_res - b_res))
elif (b2[0][1] == a[0][1] and b2[1][1] == a[1][1]) :
    print(k * (c_res - b2_res))
elif (b[0][1] == a[0][1] and b[1][1] == a[5][1]) :
    print(k * (c_res - b_res))
elif (b2[0][1] == a[0][1] and b2[1][1] == a[5][1]) :
    print(k * (c_res - b2_res))
elif (b[0][1] == a[0][1] and b2[1][1] == a[5][1]) :
    print(k * (c_res - b2_res))
elif (b2[0][1] == a[0][1] and b[1][1] == a[5][1]) :
    print(k * (c_res - b_res))
elif (((b[0][0] == '1' and b[1][0] == '3') \
    or (b[0][0] == '4' and b[1][0] == '1') \
    or (b[0][0] == '3' and b[1][0] == '2') \
    or (b[0][0] == '2' and b[1][0] == '4'))) :
    print(k * (c_res - b_res))
elif (((b2[0][0] == '1' and b2[1][0] == '3') \
    or (b2[0][0] == '4' and b2[1][0] == '1') \
    or (b2[0][0] == '3' and b2[1][0] == '2') \
    or (b2[0][0] == '2' and b2[1][0] == '4'))) :
    print(k * (c_res - b2_res))

# how to solve it

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