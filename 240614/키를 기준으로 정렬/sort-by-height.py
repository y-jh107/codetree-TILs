class Student:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = height
        self.weight = weight

    def __repr__(self):
        return f'{self.name} {self.height} {self.weight}'

n = int(input())
students = []

for i in range(n):
    s = input().split()
    students.append(Student(s[0], s[1], s[2]))

students.sort(key=lambda x: x.height)

for i in range(n):
    print(students[i])