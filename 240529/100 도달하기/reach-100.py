n = int(input())

_list = [1, n]
finder = True
idx = 2

while finder:
    hap = _list[idx - 2] + _list[idx - 1]
    _list.append(hap)
    idx += 1

    if hap >= 100:
        finder = False

for i in _list:
    print(i, end = ' ')