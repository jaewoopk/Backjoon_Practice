import sys

a = []
b = []

n, m = map(int, input().split())

for i in range(n) :
    a.append(sys.stdin.readline.strip())

for i in range(m) :
    b.append(sys.stdin.readline.strip())

print(a)
