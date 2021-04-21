// Resposta para CT Execício 1

public class ContaEspecial extends Conta {
  protected double limite;

  ContaEspecial(Cliente titular) {
    super(titular);
    this.limite = 0.0;
  }

  ContaEspecial(int numero, String nome_titular, String cpf_titular, double limite) {
    super(numero, nome_titular, cpf_titular);
    this.limite = limite;
  }

  // Implementação dos métodos abstratos da superclasse
  @Override
  public boolean sacar(double valor) {
    if (this.getSaldo() + this.limite <= 0) {
      System.out.println("Esta conta não tem mais limite!");
      return false;
    } else {
      if (this.getSaldo() + this.limite >= valor) {
        this.saldo -= valor;
        return true;
      } else {
        return false;
      }
    }
  }

  @Override
  public void exibirDados() {
    System.out.println("Nome do titular: " + this.titular.getNome());
    System.out.println("Saldo: " + this.saldo);
    System.out.println("Numero da conta: " + this.numero);
    System.out.println("Limite: " + this.limite);
  }

  // Getters e Setters da subclasse
  public double getLimite() {
    return this.limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }
}