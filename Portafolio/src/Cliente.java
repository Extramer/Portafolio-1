public class Cliente {
    // Encapsulamiento
    private String id;
    private String nombre;
    private boolean presenteFisicamente; // Simula si el cliente está en el mostrador

    public Cliente(String id, String nombre, boolean presenteFisicamente) {
        this.id = id;
        this.nombre = nombre;
        this.presenteFisicamente = presenteFisicamente;
    }

    // Getters necesarios para que la Tienda pueda validar
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public boolean isPresenteFisicamente() { return presenteFisicamente; }
}
