_list = list(map(int, input().split()))

for i in range(10):
    if _list[i] % 3 == 0:
        print(_list[i - 1])
        break