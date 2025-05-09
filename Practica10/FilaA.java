package Practica10;


public class FilaA {
   
    public static void main(String[] args) {
        LineaTeleferico l1 = new LineaTeleferico();
        LineaTeleferico l2 = new LineaTeleferico("Rojo", "Estacion Central - Cementerio - 16 de Julio", 20);

        System.out.println(" Inicial ");
        System.out.println(l2);

        l2.eliminarEmpleado("Rojas");
        System.out.println("Después de eliminar apellido 'Rojas' ");
        System.out.println(l2);

        l2.transferirEmpleado("Saul", l1);
        System.out.println(" Transferencia de 'Saul' a l1 ");
        System.out.println("Línea 1:\n" + l1);
        System.out.println("Línea 2:\n" + l2);

        System.out.println(" Mayor Edad en l1 ");
        l1.mostrarMayorEdad();

        System.out.println(" Mayor Sueldo en l1 ");
        l1.mostrarMayorSueldo();
    }
}

    

