dice = list(map(int, input().split()))
dice_num = [0 for _ in range(6)]

for elem in dice:
    dice_num[elem - 1] += 1

for i in range(6):
    print(f"{i + 1} - {dice_num[i]}")