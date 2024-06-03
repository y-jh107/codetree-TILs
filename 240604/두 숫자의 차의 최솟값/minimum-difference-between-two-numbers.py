import sys

n = int(input())

_list = list(map(int, input().split()))

min_minus = sys.maxsize

for i in range(n):
    for j in range(i + 1, n):
        minus = _list[j] - _list[i]

        #print(minus, end = ' ')
        if minus < min_minus:
            min_minus = minus

print(min_minus)