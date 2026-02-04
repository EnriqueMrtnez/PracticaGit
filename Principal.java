import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Hola mundo");
        mostrarFechaHora();

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce número de usuarios: ");
        int numero = teclado.nextInt();
        teclado.nextLine();

        Usuario[] usuarios = crearUsuarios(numero, teclado);

        for (Usuario u : usuarios) {
            System.out.println(u.nombre + " " + u.apellidos + " - " + u.email);
        }
    }

    public static void mostrarFechaHora() {
        System.out.println("Fecha y hora actual: " + LocalDateTime.now());
    }

    public static Usuario[] crearUsuarios(int numero, Scanner teclado) {

        Usuario[] lista = new Usuario[numero];

        for (int i = 0; i < numero; i++) {

            Usuario u = new Usuario();

            System.out.print("Nombre: ");
            u.nombre = teclado.nextLine();

            System.out.print("Apellidos: ");
            u.apellidos = teclado.nextLine();

            System.out.print("Email: ");
            u.email = teclado.nextLine();

            lista[i] = u;
        }

        return lista;
    }
}
