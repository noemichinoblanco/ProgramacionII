import math

class Vector:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z
    
    def sumar_vectores(self, v):
        return Vector(self.x + v.x, self.y + v.y, self.z + v.z)
    
    def escalar_por_vector(self, escalar):
        return Vector(self.x * escalar, self.y * escalar, self.z * escalar)
    
    def longitud(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)
    
    def normalizar(self):
        longitud = self.longitud()
        return Vector(self.x / longitud, self.y / longitud, self.z / longitud) if longitud != 0 else None
    
    def producto_escalar(self, v):
        return self.x * v.x + self.y * v.y + self.z * v.z
    
    def producto_vectorial(self, v):
        return Vector(
            self.y * v.z - self.z * v.y,
            self.z * v.x - self.x * v.z,
            self.x * v.y - self.y * v.x
        )
    
    def proyeccion_sobre(self, v):
        factor = self.producto_escalar(v) / v.producto_escalar(v)
        return v.escalar_por_vector(factor)


v1 = Vector(3, 4, 5)
v2 = Vector(1, 2, 3)

suma = v1.sumar_vectores(v2)
producto_escalar = v1.producto_escalar(v2)
producto_vectorial = v1.producto_vectorial(v2)
proyeccion = v1.proyeccion_sobre(v2)

print(f"Suma de vectores: ({suma.x}, {suma.y}, {suma.z})")
print(f"Producto escalar: {producto_escalar}")
print(f"Producto vectorial: ({producto_vectorial.x}, {producto_vectorial.y}, {producto_vectorial.z})")
print(f"Proyección de v1 sobre v2: ({proyeccion.x}, {proyeccion.y}, {proyeccion.z})")
