
from pila import Pila

A = Pila()
A.push(7)
A.push(22)
A.push(13)
A.push(44)
B = Pila()
C = Pila()
while not A.isEmpty():
    e = A.pop()
    if e % 2 == 0:
        B.push(e)
    else:
        C.push(e)
print("Pila B:")
while not B.isEmpty():
    print(B.pop())
print("Pila C:")
while not C.isEmpty():
    print(C.pop())
