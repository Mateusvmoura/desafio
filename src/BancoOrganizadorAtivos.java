import java.util.Arrays;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine(); 

        String[] ativos = new String[quantidadeAtivos];

        for (int i = 0; i < quantidadeAtivos; i++) {
            
            ativos[i] = scanner.nextLine();
        }

        // Ordenar os ativos em ordem alfabética
        Arrays.sort(ativos);

        

        for (String ativo : ativos) {
            System.out.println(ativo);
        }

        scanner.close();
    }
}