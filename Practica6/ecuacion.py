import math

class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c
    
    def get_discriminante(self):
        return self.b**2 - 4 * self.a * self.c
    
    def tiene_raices_reales(self):
        return self.get_discriminante() >= 0
    
    def get_raices(self):
        discriminante = self.get_discriminante()
        if discriminante < 0:
            return "La ecuación no tiene raíces reales"
        elif discriminante == 0:
            raiz = -self.b / (2 * self.a)
            return f"La ecuación tiene una única raíz: {raiz}"
        else:
            raiz1 = (-self.b + math.sqrt(discriminante)) / (2 * self.a)
            raiz2 = (-self.b - math.sqrt(discriminante)) / (2 * self.a)
            return f"La ecuación tiene dos raíces: {raiz1} y {raiz2}"
        


a, b, c = map(float, input("Ingrese los coeficientes a, b y c separados por espacios: ").split()) 
ecuacion = EcuacionCuadratica(a, b, c)
print(ecuacion.get_raices())

