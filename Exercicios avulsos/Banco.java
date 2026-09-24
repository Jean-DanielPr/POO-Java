import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta p1 = new Conta();
        Conta p2 = new Conta();

        System.out.println("CADASTRO BANCÁRIO");
        System.out.print("Nome: ");
        p1.setDono(scanner.nextLine());
        System.out.println("Qual tipo da conta? CC ou CP.");
        System.out.println("CC = CONTA CORRENTE BONUS R$50");
        System.out.println("CP = CONTA POUPANÇA BONUS R$150");
        p1.abrirConta(scanner.nextLine());
        System.out.print("Quanto deseja depositar? \nR$");
        p1.depositar(scanner.nextFloat());

        p1.estadoConta();

    }
}
