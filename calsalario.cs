using System;

class DesafioSalario
{
    static void Main(string[] args)
    {
        // Ler o valor bruto do salário
        double salarioBruto = double.Parse(Console.ReadLine());

        // Ler o adicional dos benefícios
        double adicionalBeneficios = double.Parse(Console.ReadLine());

        // Calcular o percentual de imposto
        double percentualImposto;
        if (salarioBruto <= 1100.00)
        {
            percentualImposto = 0.05;
        }
        else if (salarioBruto <= 2500.00)
        {
            percentualImposto = 0.10;
        }
        else
        {
            percentualImposto = 0.15;
        }

        // Calcular o salário a ser transferido
        double salarioTransferido = salarioBruto - (salarioBruto * percentualImposto) + adicionalBeneficios;

        // Imprimir o salário a ser transferido
        Console.WriteLine(salarioTransferido);
    }
}

