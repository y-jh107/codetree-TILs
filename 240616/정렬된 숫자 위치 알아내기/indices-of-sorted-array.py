n = int(input())

_list = list(map(int, input().split()))
sorted_list = sorted(_list)

loc = []

for i in range(n):
    loc.append((i + 1, sorted_list[i]))

for i in range(n):
    lens = len(loc)
    for j in range(lens):
        if _list[i] == loc[j][1]:
            print(loc[j][0], end=' ')
            loc.pop(j)
            break