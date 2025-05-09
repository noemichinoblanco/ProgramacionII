import tkinter as tk
from tkinter import messagebox



class Boleto:
    def __init__(self, numero):
        self.numero = numero
        self.precio = 0.0

    def __str__(self):
        return f"Número: {self.numero}, Precio: {self.precio:.1f}"

class Palco(Boleto):
    def __init__(self, numero):
        super().__init__(numero)
        self.precio = 100.0

class Platea(Boleto):
    def __init__(self, numero, dias):
        super().__init__(numero)
        self.precio = 50.0 if dias >= 10 else 60.0

class Galeria(Boleto):
    def __init__(self, numero, dias):
        super().__init__(numero)
        self.precio = 25.0 if dias >= 10 else 30.0


def vender_boleto():
    try:
        numero = int(entry_numero.get())
        dias = int(entry_dias.get())
        
        if tipo_boleto.get() == 1:
            boleto = Palco(numero)
        elif tipo_boleto.get() == 2:
            boleto = Platea(numero, dias)
        elif tipo_boleto.get() == 3:
            boleto = Galeria(numero, dias)
        else:
            messagebox.showerror("Error", "Seleccione un tipo de boleto")
            return
        
        resultado_var.set(str(boleto))
    except ValueError:
        messagebox.showerror("Error", "Ingrese valores numéricos válidos")

def salir():
    root.destroy()



root = tk.Tk()
root.title("Teatro Municipal")
root.geometry("400x250")

titulo = tk.Label(root, text="Teatro Municipal", font=("Arial", 16))
titulo.pack(pady=10)


frame = tk.Frame(root)
frame.pack()


tk.Label(frame, text="Datos del Boleto").grid(row=0, column=0, sticky="w")

tipo_boleto = tk.IntVar()
tk.Radiobutton(frame, text="Palco", variable=tipo_boleto, value=1).grid(row=1, column=0, sticky="w")
tk.Radiobutton(frame, text="Platea", variable=tipo_boleto, value=2).grid(row=1, column=1, sticky="w")
tk.Radiobutton(frame, text="Galeria", variable=tipo_boleto, value=3).grid(row=1, column=2, sticky="w")


tk.Label(frame, text="Número:").grid(row=2, column=0, sticky="e")
entry_numero = tk.Entry(frame, width=5)
entry_numero.grid(row=2, column=1)

tk.Label(frame, text="Cant. Días para el Evento:").grid(row=3, column=0, columnspan=2, sticky="e")
entry_dias = tk.Entry(frame, width=5)
entry_dias.grid(row=3, column=2)


btn_frame = tk.Frame(root)
btn_frame.pack(pady=10)

tk.Button(btn_frame, text="Vende", command=vender_boleto, width=10).pack(side="left", padx=10)
tk.Button(btn_frame, text="Salir", command=salir, width=10).pack(side="right", padx=10)


resultado_var = tk.StringVar()
resultado_label = tk.Label(root, textvariable=resultado_var, font=("Arial", 12), fg="blue")
resultado_label.pack(pady=10)


root.mainloop()

