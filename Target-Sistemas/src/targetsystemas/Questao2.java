package targetsystemas;

import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int quantidadeDeA = contarOcorrenciasDeA(frase);

        if (quantidadeDeA > 0) {
            System.out.println("A letra 'a' aparece " + quantidadeDeA + " vezes na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }
        
        sc.close();
    }
    
     public static int contarOcorrenciasDeA(String frase) {
        int count = 0;

        // Percorre cada caractere da string
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            // Verifica se o caractere é 'a' ou 'A'
            if (c == 'a' || c == 'A' || c == 'Ã' || c == 'Á' || c == 'á' || c == 'ã') {
                count++;
            }
        }

        return count;
    }
}
