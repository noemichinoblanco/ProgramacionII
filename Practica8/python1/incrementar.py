class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z

    def incrementaXZ(self):
        self.x += 1
        self.z += 1

    def incrementaZ(self):
        self.z += 1

class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z

    def incrementaYZ(self):
        self.y += 1
        self.z += 1

    def incrementaZ(self):
        self.z += 1

class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)

    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1

    def mostrar(self):
        print(f"x = {self.x}, y = {self.y}, z = {self.z}")

val = D(1, 2, 3)
val.mostrar()
val.incrementaXYZ()
val.mostrar()
val.incrementaXZ()
val.mostrar()
val.incrementaYZ()
val.mostrar()
