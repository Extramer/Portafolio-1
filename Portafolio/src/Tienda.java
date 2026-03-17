import java.util.ArrayList;
import java.util.List;

/**
 * Abstracción: La clase Tienda modela el entorno físico donde se gestiona 
 * la promoción exclusiva.
 */
public class Tienda {
    
    // Encapsulamiento: Los atributos son privados para evitar que clases externas
    // alteren el límite de 50 copias o modifiquen la lista sin validación.
    private final int LIMITE_APARTADOS = 50; 
    
    // Asociación/Composición: La Tienda maneja una lista de Apartados.
    private List<Apartado> apartadosRealizados;

    public Tienda() {
        this.apartadosRealizados = new ArrayList<>();
    }

    /**
     * Modularidad: Toda la lógica para validar el apartado está contenida en este método.
     * Dependencia: Este método depende del objeto 'Cliente' para funcionar.
     */
    public boolean registrarApartadoPresencial(Cliente cliente) {
        
        // 1. Validar el límite estricto de 50 personas
        if (apartadosRealizados.size() >= LIMITE_APARTADOS) {
            System.out.println("Promoción agotada: Se han alcanzado los 50 apartados.");
            return false;
        }

        // 2. Validar presencia física (Abstracción del mundo real)
        if (!cliente.isPresenteFisicamente()) {
            System.out.println("Error: El trámite es estrictamente presencial en la sucursal.");
            return false;
        }

        // 3. Validar que el cliente no tenga ya un apartado (1 por persona)
        for (Apartado apartadoExistente : apartadosRealizados) {
            if (apartadoExistente.getCliente().getId().equals(cliente.getId())) {
                System.out.println("Error: El cliente " + cliente.getNombre() + " ya tiene una copia apartada.");
                return false;
            }
        }

        // Si pasa todas las validaciones, se crea el apartado (Agregación)
        Apartado nuevoApartado = new Apartado(cliente);
        apartadosRealizados.add(nuevoApartado);
        System.out.println("¡Éxito! Apartado registrado para: " + cliente.getNombre() + 
                           ". Quedan " + getEspaciosDisponibles() + " copias.");
        return true;
    }

    // Encapsulamiento: Solo proveemos un método "getter" para ver la disponibilidad, 
    // sin permitir que se cambie el límite mágico de 50.
    public int getEspaciosDisponibles() {
        return LIMITE_APARTADOS - apartadosRealizados.size();
    }
}
