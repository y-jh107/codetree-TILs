n = int(input())
arr = list(map(float, input().split()))

score_sum = sum(arr)

score_avg = score_sum / n

if score_avg >= 4.0:
    print(f"{score_avg:.1f}")
    print("Perfect")
elif score_avg >= 3.0:
    print(f"{score_avg:.1f}")
    print("Good")
else:
    print(f"{score_avg:.1f}")
    print("Poor")