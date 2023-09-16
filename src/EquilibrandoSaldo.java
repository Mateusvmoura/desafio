import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        scanner.nextLine();
        
        double valorDeposito = scanner.nextDouble();
        scanner.nextLine();

        double valorRetirada = scanner.nextDouble();
        scanner.nextLine();

        saldoAtual = (saldoAtual+valorDeposito) - valorRetirada;

        System.out.println("Saldo atualizado na conta: " + saldoAtual);
        
        scanner.close();
    }
}
