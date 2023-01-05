def pascal(a , b) :
    res = 1
    res2 = 1
    for i in range(b) :
        res *= (a - i)
        print("%d "%(a - i),end=" ")
    
    print("")
    for j in range(b) :
        res2 *= (b - j)
        print("%d "%(b - j),end=" ")
    print("")
    print((int)(res/res2))
    return


a, b = map(int, input().split())

pascal(a,b)
