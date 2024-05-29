n = int(input())
_list = list(map(int, input().split()))

new_list = []

for i in range(n):
    if _list[i] % 2 == 0:
        new_list.append(_list[i])

for i in new_list:
    print(i, end = ' ')