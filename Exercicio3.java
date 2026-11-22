import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial (R$): ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros ao mês (%): ");
        double taxaMensal = scanner.nextDouble();

        System.out.print("Digite o tempo em meses: ");
        int tempo = scanner.nextInt();

        double taxaDecimal = taxaMensal / 100.0;
        double valorFinal = valorInicial * Math.pow(1 + taxaDecimal, tempo);

        System.out.printf("Valor final ao fim do período: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
