import java.util.Scanner;
import java.time.Year;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        String categoria;
        if (idade < 12) {
            categoria = "Infantil";
        } else if (idade <= 17) {
            categoria = "Adolescente";
        } else if (idade <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Sênior";
        }

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Categoria: " + categoria);

        scanner.close();
    }
}
