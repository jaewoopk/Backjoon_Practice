import sys

def StringToInt(s) :
    try :
        tmp = int(eval(str(s)))
        if type(tmp) == int :
            return tmp
    except :
        return 0

def BinarySearch(poketbook, poketbook2, check, start, end, point) :
    while (start <= end) :
        mid = (start + end) // 2
        if (poketbook2[mid] == check[point]) :
            print(poketbook[poketbook2[mid]] + 1)
            return
        elif (poketbook2[mid] < check[point]) :
            start = mid + 1
        else :
            end = mid - 1
    return

n, m = map(int, sys.stdin.readline().split())

book = {}
check = []

for i in range(n) :
    poketmon = input()
    book.setdefault(poketmon,i)

for i in range(m) :
    check.append(input())

realbook = list(book.keys())
poketbook = dict(sorted(book.items()))
poketbook2 = list(poketbook.keys())

for i in range(m) :
    checker = StringToInt(check[i])
    if (checker) :
        print(realbook[checker - 1])
    else :
        BinarySearch(poketbook, poketbook2, check, 0, n - 1, i)

