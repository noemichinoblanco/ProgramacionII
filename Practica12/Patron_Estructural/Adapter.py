class CarreraInformatica:
    def buscar_libro(self, titulo):
        print(f"Buscando '{titulo}' en el carrera informatica...")

class SistemaNuevo:
    def search_book(self, title):
        print(f"Searching '{title}' corriendo...")

class AdaptadorSistema:
    def __init__(self):
        self.nuevo = SistemaNuevo()

    def buscar_libro(self, titulo):
        self.nuevo.search_book(titulo)


antiguo = CarreraInformatica()
antiguo.buscar_libro("libro encontrados en carrera informatica")

adaptado = AdaptadorSistema()
adaptado.buscar_libro("Inteligencia Artificial")

