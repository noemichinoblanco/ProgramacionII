class Pila {
	
	private int n; 
	private long[] arreglo;
	private int top; 
	public Pila(int n) { 
		this.n = n; // asigna el tama�o del
		arreglo = new long[n]; // crea arreglo
		top = -1; // todavia no tiene elementos
	}
	public void push(long e) { // inserta un elemento en la cima de la pila
		if (!isFull()) {
			top++;            // incrementa top
			arreglo[top] = e; // inserta elemento
		} else
			System.out.println("Pila llena.");
	}
	public long pop() { // elimina un elemento de la cima de la pila
		long e = Long.MIN_VALUE;
		if (!isEmpty()){
			e = arreglo[top]; // retorna el elemento
			top--;            // decrementa top
		} else
			System.out.println("Pila vac�a.");
		return e;
	}
	public long peek() { // obtiene el elemento de la cima de la pila
		long e = Long.MIN_VALUE;
		if (!isEmpty()){
			e = arreglo[top]; // retorna el elemento
		} else
			System.out.println("Pila vac�a.");
		return e;
	}
	public boolean isEmpty() { // verdad si la pila est� vac�a
		return (top == -1);
	}
	public boolean isFull() { // verdad si la pila est� llena
		return (top == this.n - 1);
	}
}
