import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int numero;
        String agencia, nomeCliente;
        double saldo;

        
        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt(); 
        
        
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine(); 

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine(); 

        System.out.println("Por favor, digite o saldo inicial da conta:");
        saldo = scanner.nextDouble(); 

        
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numero + " e seu saldo R$ " + String.format("%.2f", saldo) 
                          + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}
