public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
	mostrarFechaHora();
    }

    public static void mostrarFechHora() {
	System.out.println("Fecha y hora actual: " + LocalDateTime.now());
    }
}
