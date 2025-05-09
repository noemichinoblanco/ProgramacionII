// Se inserta elementos en la pila A.
// Luego, se lleva los elementos de la pila A,
// a las pilas B y C.
// Si el elemento es par se inserta en la pila B,
// si el elemento es impar se inserta en la pila C.

class AppPila {
	public static void main(String[] args) {
		Pila A = new Pila(5);
		A.push(7);
		A.push(22);
		A.push(13);
		A.push(44);
		Pila B = new Pila(5);
		Pila C = new Pila(5);
		while (!A.isEmpty()) {
			long e = A.pop();
			if (e % 2 == 0)
				B.push(e);
			else
				C.push(e);
		}
		
		System.out.println("Pila B:");
		while (!B.isEmpty())
			System.out.println(B.pop());

		System.out.println("Pila C:");
		while (!C.isEmpty())
			System.out.println(C.pop());
	}
}