scores = list(map(int, input().split()))
grade = [0 for _ in range(11)]

for score in scores:
    if score == 0:
        break
    
    grade[score // 10] += 1

for i in range(10, 0, -1):
    print(f"{i * 10} - {grade[i]}")