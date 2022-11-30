import java.io.*;
import java.util.Scanner;

public class Exercicio01 {
    static private String readLine (String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        String nome = scanner.nextLine();
        return nome;
    }

    public static void main(String[] args) throws IOException {
        String s, nomeFile = null;
        nomeFile = readLine("Nome ficheiro: ");                         // ler nome de um ficheiro
        BufferedReader f = null;                                           // declarar um descriptor para leitura do ficheiro de texto

        try {
            f = new BufferedReader(new FileReader(nomeFile));              // abrir o ficheiro de texto
        } catch (Exception e) {
            System.out.println("Impossível abrir o ficheiro " + nomeFile);
            System.out.println("fim do programa...");
            return;
        }
        s = f.readLine();                                                 // ler a 1a linha

        while(s != null) {                                                // o readLine devolve null no fim ficheiro
            System.out.println(s);                                        // mostrar linha no ecrã
            s = f.readLine();                                             // ler a linha seguinte
        }
        f.close();

    }
}
