// Importamos la clase JOptionPane para usar ventanas de entrada/salida gráficas
import javax.swing.JOptionPane;

public class Motocicletas_RCM { // Clase principal con nombre solicitado por la actividad
    public static void main(String[] args) {
        boolean continuar = true; // Variable para controlar si el menú se sigue mostrando
        // Ciclo que se repite mientras el usuario quiera cotizar otra moto
        while (continuar) {
            // Mostramos el menú de marcas y obtenemos la opción elegida
            String opcionOverlord = JOptionPane.showInputDialog(
                "Seleccione la marca de motocicleta:\n" +
                "1. Honda ($45,000)\n" +
                "2. Yamaha ($50,000)\n" +
                "3. Suzuki ($48,000)\n" +
                "4. Otra marca ($42,000)\n\n" +
                "Presione Cancelar o cierre la ventana para salir."
            );
            // Si el usuario presiona Cancelar o cierra la ventana, se termina el programa
            if (opcionOverlord == null) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de cotizacion. Hasta pronto!");
                break;
            }

            int opcion;
            // Intentamos convertir el texto ingresado en número
            try {
                opcion = Integer.parseInt(opcionOverlord);
            } catch (NumberFormatException e) {
                // Si lo ingresado no es un número válido, mostramos mensaje y reiniciamos el ciclo
                JOptionPane.showMessageDialog(null, "Entrada invalida. Por favor, ingrese un numero del 1 al 4.");
                continue;
            }
            // Declaramos variables con nombres personalizados
            double precioPulgoso = 0;        // Precio base de la moto
            double descuentoSpice = 0;       // Monto del descuento aplicado
            double totalFinalRafa = 0;       // Precio final después del descuento
            String marcaSeleccionada = "";   // Nombre de la marca seleccionada

            switch (opcion) {
                case 1:
                    marcaSeleccionada = "Honda";
                    precioPulgoso = 45000;
                    descuentoSpice = precioPulgoso * 0.05;
                    break;
                case 2:
                    marcaSeleccionada = "Yamaha";
                    precioPulgoso = 50000;
                    descuentoSpice = precioPulgoso * 0.08;
                    break;
                case 3:
                    marcaSeleccionada = "Suzuki";
                    precioPulgoso = 48000;
                    descuentoSpice = precioPulgoso * 0.10;
                    break;
                case 4:
                    marcaSeleccionada = "Otra marca";
                    precioPulgoso = 42000;
                    descuentoSpice = precioPulgoso * 0.02;
                    break;
                default:
                    // Si el número no está entre 1 y 4, avisamos al usuario
                    JOptionPane.showMessageDialog(null, "Opción no valida. Intente de nuevo.");
                    continue;
            }
            // Calculamos el precio total final después del descuento
            totalFinalRafa = precioPulgoso - descuentoSpice;
            // Mostramos el desglose al usuario: precio, descuento, total a pagar
            JOptionPane.showMessageDialog(null,
                "Marca seleccionada: " + marcaSeleccionada + "\n" +
                "Precio de la moto: $" + String.format("%.2f", precioPulgoso) + "\n" +
                "Descuento aplicado: $" + String.format("%.2f", descuentoSpice) + "\n" +
                "Total a pagar: $" + String.format("%.2f", totalFinalRafa));
        }
    }
}
