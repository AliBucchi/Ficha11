import java.io.*;
import java.util.Scanner;

public class Exercicio02 {
    static private String readLine() {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        return nome;
    }

    public static void main(String[] args) throws IOException {
        String s;
        String nomeFile = "src/data/novoFicheiro.txt";
        BufferedWriter f = null; // declarar descritor para acesso ao ficheiro em modo escrita

        try {
            f = new BufferedWriter(new FileWriter(nomeFile, false)); // abrir o ficheiro de texto
        } catch (Exception e) {
            System.out.println("Impossível criar o ficheiro " + nomeFile);
            System.out.println("fim do programa...");
            return;
        }

        System.out.println("Escreva algo...");
        s = readLine(); // ler uma linha do teclado
        while (s.length() > 0) { // termina quando digitar <enter>
            f.write(s); // escrever a linha no ficheiro
            f.newLine(); // inserir mudança linha no ficheiro
            s = readLine(); // ler outra linha do teclado }
            f.close(); // fechar o ficheiro
            System.out.println("O conteúdo foi armazenado no ficheiro " + nomeFile);
        }
    }
}

