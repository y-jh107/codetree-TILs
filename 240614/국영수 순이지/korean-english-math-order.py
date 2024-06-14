class Student:
    def __init__(self, name, kor, eng, math):
        self.name = name
        self.kor = kor
        self.eng = eng
        self.math = math
    
    def __repr__(self):
        return f'{self.name} {self.kor} {self.eng} {self.math}'

n = int(input())
students = []

for i in range(n):
    s = input().split()
    students.append(Student(s[0], int(s[1]), int(s[2]), int(s[3])))

students.sort(lambda x: (-x.kor, -x.eng, -x.math))

for i in range(n):
    print(students[i])