import java.io.*;
import java.util.*;

public class FicheroSecuencial <T extends LeerFicheroSecuencial> {
    // Creamos los atributos de la clase, que son el propio, el separador y el scanner
    private File fichero;     
    private String caracterSeparador;
    private Scanner sc;

    // Creamos el constructor que debe inicializar los atributos recibidos por parámetro
    public FicheroSecuencial(String nombreFichero, String caracter) throws IOException {
        fichero = new File(nombreFichero);
        caracterSeparador = caracter;
        sc = new Scanner(fichero);
    }


    // Creamos un método que cierre el Scanner
    public void cerrar() {
        sc.close();
    }

    // Método que lee el contenido del fichero a partir de una clase cualquiera recibida por parámetro
    public void leer(T t) throws IOException {
        String[] vector = sc.nextLine().split(caracterSeparador);
        t.readData(vector);
    }

    // Método que salta una línea sin tratarla
    public void saltar() {
        sc.nextLine();
    }

    // Método que devuelve si se ha llegado al final del archivo, o cuenta con más líneas
    public boolean esFindeArchivo() {
        return !sc.hasNextLine();
    }

}
