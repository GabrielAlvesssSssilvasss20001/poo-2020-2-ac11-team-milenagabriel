// Resposta para CT Execício 1

public class ContaPoupanca extends Conta {
  ContaPoupanca (Cliente titular) {
    super(titular);
    this.limite = 0.0;
  }

  ContaPoupanca (String nome_titular, String cpf_titular, double limite) {
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
    if (this.getSaldo() >= valor){
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void exibirDados() {
    System.out.println("Nome do titular: "+this.nome_titular);
    System.out.println("Saldo: "+this.saldo);
    System.out.println("Numero da conta: "+this.numero);
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

  // Métodos específicos da subclasse
  public void reajustar(double percentual) {
    double saldoAtual = this.getSaldo();
    double reajuste = saldoAtual + (saldoAtual *(percentual/100));
    this.depositar(reajuste);
  }
}