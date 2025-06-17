// Importamos la clase JOptionPane de Swing para mostrar ventanas emergentes
import javax.swing.JOptionPane;

// ==============================
// CLASE BASE: Instrumento
// ==============================

// Clase abstracta que representa un instrumento musical genérico
// Aquí aplicamos HERENCIA, ya que otras clases (viento, cuerda, percusión) heredarán de esta
abstract class Instrumento {
    // Atributos privados (ENCAPSULAMIENTO), accesibles solo por métodos de la clase
    private String nombre;
    private String tipo;
    private String material;
    private String barrio;

    // Constructor con parámetros para inicializar todos los atributos del instrumento
    public Instrumento(String nombre, String tipo, String material, String barrio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
        this.barrio = barrio;
    }

    // Métodos públicos para acceder a los atributos privados (getters)
    // Aquí reforzamos el ENCAPSULAMIENTO
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public String getMaterial() { return material; }
    public String getbarrio() { return barrio; }

    // Método abstracto que será implementado de forma distinta por cada tipo de instrumento
    // Esto es POLIMORFISMO: cada clase hija lo definirá a su manera
    public abstract String tocar();
}

// ==============================
// SUBCLASE: InstrumentoViento
// ==============================

// Esta clase representa instrumentos de viento (como flauta, clarinete, etc.)
// Hereda de Instrumento
class InstrumentoViento extends Instrumento {

    // Constructor específico que fija el tipo como "Viento"
    public InstrumentoViento(String nombre, String material, String barrio) {
        super(nombre, "Viento", material, barrio);
    }

    // Implementación del método abstracto tocar (POLIMORFISMO)
    @Override
    public String tocar() {
        return "🎵 El instrumento de viento '" + getNombre() + "' sopla con fuerza y elegancia.";
    }
}

// ==============================
// SUBCLASE: InstrumentoCuerda
// ==============================

class InstrumentoCuerda extends Instrumento {

    // Constructor que fija el tipo como "Cuerda"
    public InstrumentoCuerda(String nombre, String material, String barrio) {
        super(nombre, "Cuerda", material, barrio);
    }

    // Cada clase hija implementa su propia versión del método tocar
    @Override
    public String tocar() {
        return "🎻 El instrumento de cuerda '" + getNombre() + "' vibra con notas armoniosas.";
    }
}

// ==============================
// SUBCLASE: InstrumentoPercusion
// ==============================

class InstrumentoPercusion extends Instrumento {

    // Constructor que fija el tipo como "Percusión"
    public InstrumentoPercusion(String nombre, String material, String barrio) {
        super(nombre, "Percusión", material, barrio);
    }

    // Otra versión del método tocar, distinta a viento y cuerda
    @Override
    public String tocar() {
        return "🥁 El instrumento de percusión '" + getNombre() + "' retumba con ritmo poderoso.";
    }
}

// ==============================
// CLASE PRINCIPAL: Orquesta_RCM
// ==============================

public class Orquesta_RCM {

    // Método principal que ejecuta el programa
    public static void main(String[] args) {

        // Creamos un arreglo de tipo Instrumento (la clase base)
        // Aquí usamos POLIMORFISMO: podemos guardar cualquier subclase (viento, cuerda o percusión)
        Instrumento[] instrumentosOverlord = new Instrumento[3];

        // Creamos cada instrumento con sus propios datos y lo guardamos en el arreglo
        // Usamos nombres personalizados como Pulgoso, Spice y Octubre(me quede sin inspiracion) como pide el ejercicio
        instrumentosOverlord[0] = new InstrumentoViento("Flauta Pulgoso", "Madera", "Alemania");
        instrumentosOverlord[1] = new InstrumentoCuerda("Violín Spice", "Caoba", "Italia");
        instrumentosOverlord[2] = new InstrumentoPercusion("Timbal Octubre", "Bronce", "África");

        // Usamos un StringBuilder para concatenar el texto que vamos a mostrar
        StringBuilder salida = new StringBuilder();

        // Recorremos el arreglo usando un ciclo for-each (INSTRUCCIÓN DE REPETICIÓN)
        // Aquí también se aplica POLIMORFISMO: el método tocar() se comporta diferente según la clase
        for (Instrumento rafaInstrumento : instrumentosOverlord) {
            salida.append("Instrumento: ").append(rafaInstrumento.getNombre()).append("\n")
                  .append("Tipo: ").append(rafaInstrumento.getTipo()).append("\n")
                  .append("Material: ").append(rafaInstrumento.getMaterial()).append("\n")
                  .append("Origen: ").append(rafaInstrumento.getbarrio()).append("\n")
                  .append(rafaInstrumento.tocar()).append("\n\n");
        }

        // Mostramos toda la información en una ventana emergente con Swing
        // Así no usamos la consola, como pide el ejercicio
        JOptionPane.showMessageDialog(null, salida.toString(), "Orquesta RCM", JOptionPane.INFORMATION_MESSAGE);
    }
}
