package targetsystemas;

public class Questao3 {

    public static void main(String[] args) {
        
        //  Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; 
        //  enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
        
        int indice = 12, soma = 0, k = 1;
        
        while (k < indice) {
            k += 1;
            soma += k;
            System.out.print(soma + " ");
        }
        // soma vai ficar com  valor final de 77
    }
}
