// Resposta para CT Execício 1

public class ContaEspecial extends Conta {
  protected double limite;

  ContaEspecial (Cliente titular) {
    super(titular);
    this.limite = 0.0;
  }

  ContaEspecial (String nome_titular, String cpf_titular, double limite) {
    super(nome_titular, cpf_titular);
    this.limite = limite;
    this.numero = numero++;
  }
  
  // Implementação dos métodos abstratos da superclasse
  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public boolean sacar(double valor) {
    if (this.getSaldo() + this.limite <= 0) {
      System.out.println("Esta conta não tem mais limite!");
      return false;
    } else {
      if (this.getSaldo() + this.limite >= valor){
        this.saldo -= valor;
        return true;
      } else {
        return false;
      }
    }
  }

  @Override
  public void exibirDados() {
    System.out.println("Nome do titular: "+this.nome_titular);
    System.out.println("Saldo: "+this.saldo);
    System.out.println("Numero da conta: "+this.numero);
    System.out.println("Limite: "+this.limite);
  }

  @Override
  public int imprimirTipoConta() {
    if(this.getClass() == Conta.class){
        System.out.println("\nConta Simples\n");
        return 1;
    }
    else if(this.getClass() == ContaEspecial.class){
        System.out.println("\nConta Especial\n");
        return 2;
    }
    else if(this.getClass() == ContaPoupanca.class){
        System.out.println("\nConta Poupanca\n");
        return 3;
    }
    return 0;
  }

  // Getters e Setters da subclasse
  public double getLimite() {
    return this.limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }
}