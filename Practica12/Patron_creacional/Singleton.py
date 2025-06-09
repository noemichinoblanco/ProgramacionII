class Configuracion:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
            cls._instancia.gestion = "2025-1"
        return cls._instancia

    def set_gestion(self, nueva_gestion):
        self.gestion = nueva_gestion

    def get_gestion(self):
        return self.gestion


config1 = Configuracion()
print("Gestión actual informatica:", config1.get_gestion())

config2 = Configuracion()
config2.set_gestion("2025-2")

print("Gestión desde config1:", config1.get_gestion())  
print("¿Es la misma instancia?", config1 is config2)     

