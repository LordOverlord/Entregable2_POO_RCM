import javax.swing.JOptionPane;

public class ArregloBidi_RCM {

    public static void main(String[] args) {
        // Matriz fija 3x2
        int[][] matrizPulgoso = {
            {12, 85},
            {34, 65},
            {99, 21}
        };

        // Matriz irregular 3x3 (con longitudes distintas)
        int[][] matrizSpice = new int[3][];
        matrizSpice[0] = new int[]{15, 37, 88};     // 3 valores
        matrizSpice[1] = new int[]{44, 62};         // 2 valores
        matrizSpice[2] = new int[]{109, 3, 74};     // 3 valores

        // Mostrar ambas matrices usando el método personalizado
        String salidaPulgoso = mostrarMatriz("matrizPulgoso", matrizPulgoso);
        String salidaSpice = mostrarMatriz("matrizSpice", matrizSpice);

        // Mostrar en ventanas emergentes
        JOptionPane.showMessageDialog(null, "Primera matriz (3x2):\n" + salidaPulgoso);
        JOptionPane.showMessageDialog(null, "Segunda matriz irregular:\n" + salidaSpice);
    }

    // Método para recorrer e imprimir cualquier matriz bidimensional como String
    public static String mostrarMatriz(String nombre, int[][] matrizRafa) {
        StringBuilder resultadofinalfinal = new StringBuilder();
        for (int i = 0; i < matrizRafa.length; i++) {
            resultadofinalfinal.append(nombre).append("[").append(i).append("] = ");
            for (int j = 0; j < matrizRafa[i].length; j++) {
                resultadofinalfinal.append(matrizRafa[i][j]).append(" ");
            }
            resultadofinalfinal.append("\n");
        }
        return resultadofinalfinal.toString();
    }
}
