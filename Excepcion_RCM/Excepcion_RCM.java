import javax.swing.JOptionPane;

// Clase principal
public class Excepcion_RCM {

    public static void main(String[] args) {
        try {
            // Llamamos al método que puede lanzar una excepción
            int valorIngresado = pedirNumeroRafa();
            JOptionPane.showMessageDialog(null, "¡Número aceptado! Elegiste: " + valorIngresado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "⚠️ Eso no era un número válido. Intenta con un número entre 1 y 10.");
        } catch (CancelarOperacionException e) {
            JOptionPane.showMessageDialog(null, "🚪 Has cancelado la operación. ¡Hasta luego!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "🚫 Error: " + e.getMessage());
        }
    }

    // Método que pide un número y puede lanzar varias excepciones
    public static int pedirNumeroRafa() throws Exception {
        String entradaSpice = JOptionPane.showInputDialog("Introduce un número entre 1 y 10:");

        // Si el usuario cancela (presiona Cancelar o cierra la ventana)
        if (entradaSpice == null) {
            throw new CancelarOperacionException("Operación cancelada por el usuario.");
        }

        // Posible NumberFormatException si no es número
        int numeroPulgosito = Integer.parseInt(entradaSpice);

        // Validamos si está en el rango correcto
        if (numeroPulgosito < 1 || numeroPulgosito > 10) {
            throw new Exception("El número " + numeroPulgosito + " está fuera del rango permitido.");
        }

        return numeroPulgosito;
    }
}

// Excepción personalizada para manejar cancelaciones del usuario
class CancelarOperacionException extends Exception {
    public CancelarOperacionException(String mensaje) {
        super(mensaje);
    }
}
