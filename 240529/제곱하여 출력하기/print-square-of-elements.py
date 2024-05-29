n = int(input())

_list = list(map(int, input().split()))

new_list = [i ** 2 for i in _list]

for i in range(n):
    print(new_list[i], end = ' ')