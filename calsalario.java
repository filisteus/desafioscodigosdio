import java.util.Scanner;

public class DesafioSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor bruto do salário
        double salarioBruto = scanner.nextDouble();

        // Ler o adicional dos benefícios
        double adicionalBeneficios = scanner.nextDouble();

        // Calcular o percentual de imposto
        double percentualImposto;
        if (salarioBruto <= 1100.00) {
            percentualImposto = 0.05;
        } else if (salarioBruto <= 2500.00) {
            percentualImposto = 0.10;
        } else {
            percentualImposto = 0.15;
        }

        // Calcular o salário a ser transferido
        double salarioTransferido = salarioBruto - (salarioBruto * percentualImposto) + adicionalBeneficios;

        // Imprimir o salário a ser transferido
        System.out.println(salarioTransferido);
    }
}

