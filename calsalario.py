def calcular_salario(salario_bruto, adicional_beneficios):
  """
  Calcula o salário a ser transferido para um funcionário.

  Args:
    salario_bruto: O valor bruto do salário.
    adicional_beneficios: O adicional dos benefícios.

  Returns:
    O salário a ser transferido.
  """

  # Calcular o percentual de imposto
  percentual_imposto = 0.05
  if salario_bruto > 1100.00:
    percentual_imposto = 0.10
  if salario_bruto > 2500.00:
    percentual_imposto = 0.15

  # Calcular o salário a ser transferido
  salario_transferido = salario_bruto - (salario_bruto * percentual_imposto) + adicional_beneficios

  return salario_transferido

# Ler o valor bruto do salário e o adicional dos benefícios
salario_bruto = float(input("Digite o valor bruto do salário: "))
adicional_beneficios = float(input("Digite o adicional dos benefícios: "))

# Calcular o salário a ser transferido
salario_transferido = calcular_salario(salario_bruto, adicional_beneficios)

# Imprimir o salário a ser transferido
print(f"Salário a ser transferido: R${salario_transferido:.2f}")


