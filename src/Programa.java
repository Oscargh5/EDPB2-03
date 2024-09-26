import java.io.IOException;

public class Programa {
     public static void main(String[] args) {
        
        try {
            FicheroSecuencial f = new FicheroSecuencial("weather.csv", ',');
            f.leer();
        } catch(IOException e){
            System.out.println(e.getMessage());
    
        }
    }
}
