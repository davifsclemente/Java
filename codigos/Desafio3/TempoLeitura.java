package Desafio3;

import java.util.Scanner;

// Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o
// número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está aprendendo
// Java, você se disponibilizou para ajudá-la com esse desenvolvimento.

public class TempoLeitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;

        System.out.println((paginas / paginasLidas) + " dias");
    }
}