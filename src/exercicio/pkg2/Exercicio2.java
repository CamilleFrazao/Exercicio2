package exercicio.pkg2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camille
 */
public class Exercicio2 {

    public static void main(String[] args) {

        File entrada = new File("/home/camille/Exercicio2/src/exercicio/pkg2/ExemploEntrada.txt");
        List<String> ids = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        List<String> enderecos = new ArrayList<>();
        List<String> logins = new ArrayList<>();

        try {

            FileReader lerEntrada = new FileReader(entrada);
            BufferedReader br = new BufferedReader(lerEntrada);

            while (br.ready()) {

                String linha = br.readLine();

                String rep = linha.replace("|", ";");

                String dados[] = rep.split(";");

                String id = dados[0];
                ids.add(id);

                String nome = dados[1];
                nomes.add(nome);

                String endereco = dados[2];
                enderecos.add(endereco);

                String login = dados[3];
                logins.add(login);

            }

            br.close();
            lerEntrada.close();

        } catch (FileNotFoundException ex) {

            Logger.getLogger(Exercicio2.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Exercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }

        File saida = new File("/home/camille/Exercicio2/src/exercicio/pkg2/Saida.txt");
        FileWriter escreveSaida;

        try {

            escreveSaida = new FileWriter(saida);
            BufferedWriter bw = new BufferedWriter(escreveSaida);

            for (int i = 0; i < 9038; i++) {
                if (ids.get(i).length() < 5) {
                    int sub = 5 - ids.get(i).length();

                    bw.write(ids.get(i));
                    System.out.print(ids.get(i));

                    for (int j = 0; j < sub; j++) {
                        bw.write(" ");
                        System.out.print(" ");
                    }

                    bw.write("|");
                    System.out.print("|");

                } else {
                    bw.write(ids.get(i) + "|");
                    System.out.print(ids.get(i) + "|");
                }

                if (nomes.get(i).length() < 46) {

                    int sub = 46 - nomes.get(i).length();

                    bw.write(nomes.get(i));
                    System.out.print(nomes.get(i));

                    for (int j = 0; j < sub; j++) {
                        bw.write(" ");
                        System.out.print(" ");
                    }

                    bw.write("|");
                    System.out.print("|");

                } else {
                    bw.write(nomes.get(i) + "|");
                    System.out.print(nomes.get(i) + "|");
                }

                if (enderecos.get(i).length() < 74) {

                    int sub = 74 - enderecos.get(i).length();

                    bw.write(enderecos.get(i));
                    System.out.print(enderecos.get(i));

                    for (int j = 0; j < sub; j++) {
                        bw.write(" ");
                        System.out.print(" ");
                    }
                    bw.write("|");
                    System.out.print("|");

                } else {
                    bw.write(enderecos.get(i) + "|");
                    System.out.print(enderecos.get(i) + "|");
                }

                bw.write(logins.get(i));
                System.out.print(logins.get(i));

                bw.newLine();
                System.out.println();

            }

        } catch (IOException ex) {

            Logger.getLogger(Exercicio2.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
