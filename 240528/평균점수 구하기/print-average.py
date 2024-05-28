scores = list(map(float, input().split()))

score_sum = sum(scores)
score_avg = score_sum / 8

print(f"{score_avg:.1f}")