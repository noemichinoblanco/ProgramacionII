package Practica10;

public class LineaTeleferico {

    private String color;
    private String tramo;
    private int nroCabinas;
    private int nroEmpleados;
    private String[][] empleados = new String[3][100]; 
    private int[] edades = new int[100];
    private double[] sueldos = new double[100];

    public LineaTeleferico() {
        this.color = "";
        this.tramo = "";
        this.nroCabinas = 0;
        this.nroEmpleados = 0;
    }

    public LineaTeleferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;

        // Carga de ejemplo
        this.empleados[0][0] = "Pedro";
        this.empleados[1][0] = "Rojas";
        this.empleados[2][0] = "Luna";
        this.empleados[0][1] = "Lucy";
        this.empleados[1][1] = "Sosa";
        this.empleados[2][1] = "Rios";
        this.empleados[0][2] = "Ana";
        this.empleados[1][2] = "Perez";
        this.empleados[2][2] = "Rojas";
        this.empleados[0][3] = "Saul";
        this.empleados[1][3] = "Arce";
        this.empleados[2][3] = "Calle";

        this.edades[0] = 35;
        this.edades[1] = 43;
        this.edades[2] = 26;
        this.edades[3] = 29;

        this.sueldos[0] = 2500;
        this.sueldos[1] = 3250;
        this.sueldos[2] = 2700;
        this.sueldos[3] = 2500;

        this.nroEmpleados = 4;
    }

    public void eliminarEmpleado(String apellido) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[1][i].equalsIgnoreCase(apellido) || empleados[2][i].equalsIgnoreCase(apellido)) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    for (int k = 0; k < 3; k++) empleados[k][j] = empleados[k][j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--; 
            }
        }
    }

    public void transferirEmpleado(String nombre, LineaTeleferico destino) {
        int pos = -1;
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[0][i].equalsIgnoreCase(nombre)) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            int n = destino.nroEmpleados;
            for (int k = 0; k < 3; k++) destino.empleados[k][n] = empleados[k][pos];
            destino.edades[n] = edades[pos];
            destino.sueldos[n] = sueldos[pos];
            destino.nroEmpleados++;

            for (int j = pos; j < nroEmpleados - 1; j++) {
                for (int k = 0; k < 3; k++) empleados[k][j] = empleados[k][j + 1];
                edades[j] = edades[j + 1];
                sueldos[j] = sueldos[j + 1];
            }
            nroEmpleados--;
        }
    }

    public void mostrarMayorEdad() {
        int mayor = -1;
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] > mayor) mayor = edades[i];
        }
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == mayor)
                System.out.println(empleados[0][i] + " " + empleados[1][i] + " " + empleados[2][i] + " Edad: " + edades[i]);
        }
    }

    public void mostrarMayorSueldo() {
        double mayor = -1;
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] > mayor) mayor = sueldos[i];
        }
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == mayor)
                System.out.println(empleados[0][i] + " " + empleados[1][i] + " " + empleados[2][i] + " Sueldo: " + sueldos[i]);
        }
    }

    @Override
    public String toString() {
        String info = "LineaTeleferico: color=" + color + ", tramo=" + tramo + ", cabinas=" + nroCabinas + ", empleados:\n";
        for (int i = 0; i < nroEmpleados; i++) {
            info += empleados[0][i] + " " + empleados[1][i] + " " + empleados[2][i] + ", Edad: " + edades[i] + ", Sueldo: " + sueldos[i] + "\n";
        }
        return info;
    }
}

