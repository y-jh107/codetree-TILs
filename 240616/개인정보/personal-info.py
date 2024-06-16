class Person:
    def __init__(self, name, height, weight):
        self.name = name
        self.height = height
        self.weight = weight
    
    def __repr__(self):
        return f'{self.name} {self.height} {self.weight}'

_people = []

for i in range(5):
    p = input().split()
    new_person = Person(p[0], int(p[1]), float(p[2]))
    _people.append(new_person)

_people.sort(key=lambda x: x.name)

print('name')
for i in range(5):
    print(_people[i])

print()

_people.sort(key=lambda x: -x.height)

print('height')
for i in range(5):
    print(_people[i])