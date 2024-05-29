arr = list(map(int, input().split()))

odd_sum = 0
even_sum = 0

for i in range(10):
    if i % 2 == 0:
        odd_sum += arr[i]
    else:
        even_sum += arr[i]

if even_sum > odd_sum:
    print(even_sum - odd_sum)
else:
    print(odd_sum - even_sum)