hospital = [0 for _ in range(4)]

for i in range(3):
    ill = list(input().split())
    if ill[0] == 'Y' and int(ill[1]) >= 37:
        hospital[0] += 1
    elif ill[0] == 'N' and int(ill[1]) >= 37:
        hospital[1] += 1
    elif ill[0] == 'Y' and int(ill[1]) < 37:
        hospital[2] += 1
    else:
        hospital[3] += 1

for i in range(4):
    print(hospital[i], end = ' ')

if hospital[0] >= 2:
    print('E')