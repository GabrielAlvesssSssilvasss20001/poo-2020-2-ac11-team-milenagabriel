// Classe Conta utilizada em atividades anteriores
// Reutilizada para responder CT Execício 1

public abstract class Conta {
  protected Cliente titular;  
  protected double saldo;
  protected int numero;

  public Conta (Cliente titular){
    this.titular = titular;
    this.saldo = 0.0;
    this.numero = 0;
  }

  public Conta (String nome_titular, String cpf_titular) {
    this.titular = new Cliente(nome_titular, cpf_titular);
    this.numero = numero++;
  }

  // Métodos abstratos
  public abstract void depositar(double valor);

  public abstract boolean sacar(double valor);
  
  public abstract void exibirDados();

  public abstract int imprimirTipoConta();

  // Setters e Getters

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public void setNum(int numero) {
    this.numero = numero;
  }

  public String getNome() {
    return this.nome_titular;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }
}