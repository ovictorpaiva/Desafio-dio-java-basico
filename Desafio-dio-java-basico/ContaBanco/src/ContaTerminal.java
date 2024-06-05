import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e imporatar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o nosso Usúario
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite sua Conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite sua Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite seu Nome: ");
        String nomecliente = scanner.next();
        
        System.out.println("Insira seu saldo: ");
        double saldo = scanner.nextDouble();
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
