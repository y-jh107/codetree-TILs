arr = list(map(int, input().split()))

new_list = []

for i in range(len(arr)):
    if arr[i] == 0:
        break
    
    new_list.append(arr[i])

for i in new_list:
    if i % 2 == 1:
        print(i + 3, end = ' ')
    else:
        print(i // 2, end = ' ')