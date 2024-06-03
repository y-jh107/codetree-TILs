import sys

n = int(input())
cars = list(map(int, input().split()))

max_earn = -sys.maxsize

for i in range(n):
    for j in range(i + 1, n):
        earn = cars[j] - cars[i]
        #print(earn)

        if earn > max_earn:
            max_earn = earn


print(max_earn)