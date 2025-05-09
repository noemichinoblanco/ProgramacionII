import tkinter as tk
from abc import ABC, abstractmethod
import random
import math

class Coloreado(ABC):
    @abstractmethod
    def comoColorear(self):
        pass


class Figura(ABC):
    def __init__(self, color="Sin color"):
        self.color = color

    def setColor(self, color):
        self.color = color

    def getColor(self):
        return self.color

    def __str__(self):
        return f"Color: {self.color}"

    @abstractmethod
    def area(self):
        pass

    @abstractmethod
    def perimetro(self):
        pass


class Cuadrado(Figura, Coloreado):
    def __init__(self, lado, color="Azul"):
        super().__init__(color)
        self.lado = lado

    def area(self):
        return self.lado * self.lado

    def perimetro(self):
        return 4 * self.lado

    def comoColorear(self):
        return "Colorear los cuatro lados"


class Circulo(Figura):
    def __init__(self, radio, color="Rojo"):
        super().__init__(color)
        self.radio = radio

    def area(self):
        return math.pi * self.radio * self.radio

    def perimetro(self):
        return 2 * math.pi * self.radio


def generar_figuras():
    figuras = []
    for _ in range(5):
        tipo = random.randint(1, 2)
        if tipo == 1:
            lado = random.randint(1, 10)
            figuras.append(Cuadrado(lado))
        else:
            radio = random.randint(1, 10)
            figuras.append(Circulo(radio))
    return figuras


def mostrar_resultados():
    figuras = generar_figuras()
    salida_texto.delete("1.0", tk.END)
    for i, figura in enumerate(figuras):
        salida_texto.insert(tk.END, f"Figura {i+1}:\n")
        salida_texto.insert(tk.END, f"Tipo: {'Cuadrado' if isinstance(figura, Cuadrado) else 'Círculo'}\n")
        salida_texto.insert(tk.END, f"{figura}\n")
        salida_texto.insert(tk.END, f"Área: {figura.area():.2f}\n")
        salida_texto.insert(tk.END, f"Perímetro: {figura.perimetro():.2f}\n")
        if isinstance(figura, Coloreado):
            salida_texto.insert(tk.END, f"{figura.comoColorear()}\n")
        salida_texto.insert(tk.END, "----------------------\n")


ventana = tk.Tk()
ventana.title("Figuras Coloreadas")
ventana.geometry("400x400")

titulo = tk.Label(ventana, text="Generador de Figuras", font=("Arial", 14))
titulo.pack(pady=10)

boton_generar = tk.Button(ventana, text="Generar Figuras", command=mostrar_resultados)
boton_generar.pack(pady=5)

salida_texto = tk.Text(ventana, height=15, width=45)
salida_texto.pack(pady=10)

ventana.mainloop()

