h, m = map(int, input().split())
a = int(input())

time = h * 60 + m + a

if (time >= 1440) :
    print("%d %d"%((time-1440) // 60, (time-1440) % 60))
else :
    print("%d %d"%(time // 60, time % 60))