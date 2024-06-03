_list = list(map(int, input().split()))

under_500 = 0
higher_500 = 1000

for i in _list:
    if i > under_500 and i < 500:
        under_500 = i
    elif i < higher_500 and i > 500:
        higher_500 = i

print(under_500, higher_500)