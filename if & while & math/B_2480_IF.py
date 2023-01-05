a, b, c = map(int, input().split())

if (a == b == c) :
    print("%d"%(10000 + a * 1000))
elif (a == b or b == c or c == a) :
    if (a == b) :
        print("%d"%(1000 + a * 100))
    else :
        print("%d"%(1000 + c * 100))
else :
    if (a > b and a > c) :
        print("%d"%(a * 100))
    elif (b > a and b > c) :
        print("%d"%(b * 100))
    else :
        print("%d"%(c * 100))