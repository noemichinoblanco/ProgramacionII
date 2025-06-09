class Estrategia:
    def calcular(self, notas):
        pass


class PromedioSimple(Estrategia):
    def calcular(self, notas):
        return sum(notas) / len(notas)


class PromedioPonderado(Estrategia):
    def calcular(self, notas):
        pesos = [0.3, 0.3, 0.4] 
        return sum(n * p for n, p in zip(notas, pesos))


class CalculadoraNotas:
    def __init__(self, estrategia):
        self.estrategia = estrategia

    def calcular_nota(self, notas):
        return self.estrategia.calcular(notas)


notas = [75, 85, 95]

calculadora_simple = CalculadoraNotas(PromedioSimple())
print("Nota final (simple):", calculadora_simple.calcular_nota(notas))

calculadora_ponderado = CalculadoraNotas(PromedioPonderado())
print("Nota final (ponderado):", calculadora_ponderado.calcular_nota(notas))

