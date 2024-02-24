fun main(args: Array<String>) {
  // Ler o valor bruto do salário e o adicional dos benefícios
  val salarioBruto = readLine()?.toDouble() ?: 0.0
  val adicionalBeneficios = readLine()?.toDouble() ?: 0.0

  // Calcular o percentual de imposto
  val percentualImposto = when (salarioBruto) {
    in 0.0..1100.0 -> 0.05
    in 1100.1..2500.0 -> 0.10
    else -> 0.15
  }

  // Calcular o salário a ser transferido
  val salarioTransferido = salarioBruto - (salarioBruto * percentualImposto) + adicionalBeneficios

  // Imprimir o salário a ser transferido
  println("Salário a ser transferido: R$${salarioTransferido:.2f}")
}

