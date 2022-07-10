import sys

def StringToInt(s) :
    try :
        tmp = int(eval(str(s)))
        if type(tmp) == int :
            return tmp
    except :
        return 0

n, m = map(int, sys.stdin.readline().split())

book = {}
check = []

for i in range(n) :
<<<<<<< HEAD
    book.setdefault(input(),i)
=======
    poketmon = sys.stdin.readline()
    book.setdefault(poketmon,i)
>>>>>>> e7f5350788adca837b69d2454ec712f64551a356

for i in range(m) :
    check.append(sys.stdin.readline())

realbook = list(book.keys())

for i in range(m) :
    checker = StringToInt(check[i])
    if (checker) :
        print(realbook[checker - 1])
    else :
        print(book.get(check[i]) + 1)

