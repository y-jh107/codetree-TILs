nums = list(map(int, input().split()))

for i in range(10):
    num = nums[i]
    sum = 0

    if num >= 250:
        for j in range(10 - i):
            sum += nums[j]
        print(sum, sum / (10 - i))
        break