import java.util.Scanner;

public class reto1 {

    public static String[] ciudades;

    public static void main(String[] args) {
        String cantidadPacientes;
        String nombrePaciente;
        String numeroCedula;
        String edad;
        String ciudad;
        String EPS;
        String enfermedad;

        Scanner sc = new Scanner(System.in);
        cantidadPacientes = sc.nextLine();

        String[][] datosPacientes = new String[Integer.parseInt(cantidadPacientes)][6];

        for (int i = 0; i < Integer.parseInt(cantidadPacientes); i++) {
            String[] paciente = sc.nextLine().split("-");
            System.arraycopy(paciente, 0, datosPacientes[i], 0, paciente.length);
        }
        ciudades = sc.nextLine().split("-");
        System.out.println(CiudadRepetida(datosPacientes));
    }

    public static String CiudadRepetida(String[][] datosPacientes) {
        int[] cantidadCiudades = new int[ciudades.length];
        for (String[] datosPaciente : datosPacientes) {
            for (int j = 0; j < ciudades.length; j++) {
                if (datosPaciente[3].equals(ciudades[j])) {
                    cantidadCiudades[j]++;
                }
            }
        }
        int mayor = 0;
        int posicion = 0;
        for (int i = 0; i < cantidadCiudades.length; i++) {
            if (cantidadCiudades[i] > mayor) {
                mayor = cantidadCiudades[i];
                posicion = i;
            }
        }
        return ciudades[posicion];
    }
}
