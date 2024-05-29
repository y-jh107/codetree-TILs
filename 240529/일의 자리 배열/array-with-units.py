_list = list(map(int, input().split()))

for i in range(2, 10):
    fibo = _list[i - 2] + _list[i - 1]
    _list.append(fibo % 10)

for i in range(10):
    print(_list[i], end = " ")