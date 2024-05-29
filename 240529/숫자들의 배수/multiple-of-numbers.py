n = int(input())

finder = True
how_many = 1
mul_five = 0

while finder:
    mul = n * how_many
    print(mul, end = ' ')
    how_many += 1

    if mul % 5 == 0:
        mul_five += 1
    if mul_five == 2:
        finder = False