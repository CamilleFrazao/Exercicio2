package exercicio.pkg2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camille
 */
public class Exercicio2 {

    public static void main(String[] args) {

        File entrada = new File("/home/camille/Exercicio2/Exercicio-2/src/exercicio/pkg2/ExemploEntrada.txt");

        try {
            
            FileReader lerEntrada = new FileReader(entrada);
            BufferedReader br = new BufferedReader(lerEntrada);
            
            while (br.ready()) {
                
                
                
            }

        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Exercicio2.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            Logger.getLogger(Exercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
