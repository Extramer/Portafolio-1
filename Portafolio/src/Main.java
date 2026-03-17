public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  SISTEMA DE APARTADOS - VIDEOJUEGO EXCLUSIVO");
        System.out.println("==================================================\n");

        // Instanciamos la clase principal (nuestra Tienda)
        Tienda tienda = new Tienda();
        System.out.println("Espacios iniciales disponibles: " + tienda.getEspaciosDisponibles());

        // ---------------------------------------------------------
        // CASO DE PRUEBA 1: Registro exitoso
        // ---------------------------------------------------------
        System.out.println("\n---> CASO 1: Cliente presencial válido");
        Cliente cliente1 = new Cliente("101110111", "Ana Rojas", true);
        tienda.registrarApartadoPresencial(cliente1);

        // ---------------------------------------------------------
        // CASO DE PRUEBA 2: Intento de registro no presencial (Bot / Online)
        // ---------------------------------------------------------
        System.out.println("\n---> CASO 2: Cliente intenta apartar desde su casa (Falso)");
        Cliente cliente2 = new Cliente("202220222", "Carlos Pérez", false);
        tienda.registrarApartadoPresencial(cliente2);

        // ---------------------------------------------------------
        // CASO DE PRUEBA 3: Intento de acaparamiento (Doble apartado)
        // ---------------------------------------------------------
        System.out.println("\n---> CASO 3: Ana Rojas intenta apartar una segunda copia");
        // Nota que usamos el mismo ID de Ana para simular que es la misma persona
        Cliente cliente3 = new Cliente("101110111", "Ana Rojas", true); 
        tienda.registrarApartadoPresencial(cliente3);

        // ---------------------------------------------------------
        // CASO DE PRUEBA 4: Agotar el límite estricto de 50 copias
        // ---------------------------------------------------------
        System.out.println("\n---> CASO 4: Simulando la llegada de 50 personas más a la fila...");
        
        // El bucle intenta registrar 50 personas más. Como Ana ya tiene 1, 
        // el límite se alcanzará antes de terminar el bucle, y veremos el rechazo automático.
        for (int i = 1; i <= 50; i++) {
            Cliente clienteFila = new Cliente("ID-FILA-" + i, "Gamer " + i, true);
            tienda.registrarApartadoPresencial(clienteFila);
        }

        System.out.println("\n==================================================");
        System.out.println("  REPORTE FINAL DE LA TIENDA");
        System.out.println("==================================================");
        System.out.println("Espacios restantes: " + tienda.getEspaciosDisponibles());
        System.out.println("==================================================");
    }
}