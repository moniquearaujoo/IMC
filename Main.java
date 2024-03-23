import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite o seu peso: ");
        p.setPeso(sc.nextDouble());

        System.out.println("Digite a sua altura: ");
        p.setAltura(sc.nextDouble());
        p.calcularIMC();

        System.out.printf("Seu ICM é igual a: " + p.imc);

    }
}