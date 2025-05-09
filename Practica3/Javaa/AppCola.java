// Se inserta elementos en la cola A.
// Luego, se lleva los elementos de la cola A,
// a las colas B y C.
// Si el elemento es primo se inserta en la cola B,
// si el elemento no es primo se inserta en la cola C.
// Se utiliza la Criba de Eratóstenes para determinar
// si un número es primo.

class AppCola {
	static int num = 500;
	static boolean[] primo = new boolean[num];

	public static void criba() {
		for (int i = 0; i < primo.length; i++)
			primo[i] = true;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (primo[i] == true) {
				for (int j = (i * i); j < num; j = j + i)
					primo[j] = false;
			}
		}
	}

	public static void main(String[] args) {
		criba();
		Cola A = new Cola(5);
		A.insert(7);
		A.insert(22);
		A.insert(11);
		A.insert(10);

		Cola B = new Cola(5);
		Cola C = new Cola(5);
		while (!A.isEmpty()) {
			long e = A.remove();
			if (primo[(int)e])
				B.insert(e);
			else
				C.insert(e);
		}
		
		System.out.println("Cola B:");
		while (!B.isEmpty())
			System.out.println(B.remove());

		System.out.println("Cola C:");
		while (!C.isEmpty())
			System.out.println(C.remove());
	}
}
