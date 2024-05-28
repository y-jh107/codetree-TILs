arr = list(map(int, input().split()))

hap = 0

for i in range(len(arr)):
    if i == 2 or i == 4 or i == 9:
        hap += arr[i]

print(hap)