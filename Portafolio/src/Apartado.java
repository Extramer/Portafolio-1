import java.util.Date;

public class Apartado {
    
    private Cliente cliente;
    private Date fechaRegistro;
    private TicketComprobante ticket; // COMPOSICIÓN FUERTE

    // Constructor
    public Apartado(Cliente cliente) {
        this.cliente = cliente;
        this.fechaRegistro = new Date(); // Registra el momento exacto
        
        // El ticket nace EXCLUSIVAMENTE cuando se crea el apartado.
        // Si el apartado se destruye, el ticket se destruye.
        this.ticket = new TicketComprobante("TICKET-" + cliente.getId()); 
    }

    // ==========================================
    // ESTE ES EL MÉTODO QUE FALTABA
    // ==========================================
    public Cliente getCliente() {
        return this.cliente;
    }

    // Clase interna (Composición)
    private class TicketComprobante {
        private String codigo;
        
        public TicketComprobante(String codigo) {
            this.codigo = codigo;
        }
    }
}
