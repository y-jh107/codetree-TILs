nums = list(map(int, input().split()))

sum = 0
for i in range(10):
    devide = i + 1

    if nums[i] >= 250:
        devide -= 1
        break

    sum += nums[i]


print("%d %.1f" %(sum, sum / devide))