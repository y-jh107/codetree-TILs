nums = list(map(int, input().split()))

for i in range(10):
    sum = 0

    if nums[i] >= 250:
        for j in range(i):
            sum += nums[j]
        print("%d %.1f" %(sum, sum / (i)))
        break