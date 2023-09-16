import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Deposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valor = scanner.nextDouble();
         String padrao = "0.00";
        DecimalFormat df = new DecimalFormat(padrao);

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + df.format(valor));
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Encerrando o programa...");
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
             System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
        
        scanner.close();
    }
}