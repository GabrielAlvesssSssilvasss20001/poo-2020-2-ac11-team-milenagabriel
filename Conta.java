// Classe Conta utilizada em atividades anteriores
// Reutilizada para responder CT Execício 1

public abstract class Conta {
  public Cliente titular;  
  public double saldo;
  public int numero;

  public Conta (Cliente titular){
    this.titular = titular;
    this.saldo = 0.0;
    this.numero = 0;
  }

  public Conta (int numero, String nome_titular, String cpf_titular) {
    this.titular = new Cliente(nome_titular, cpf_titular);
    this.numero = numero;
  }

  // Métodos abstratos
  public void depositar(double valor){
    this.saldo += valor;
  }

  public abstract boolean sacar(double valor);
  
  public abstract void exibirDados();

  public int imprimirTipoConta() {
    if(this.getClass() == ContaEspecial.class){
        System.out.println("\nConta Especial\n");
        return 1;
    }
    else if(this.getClass() == ContaPoupanca.class){
        System.out.println("\nConta Poupanca\n");
        return 2;
    }
    return 0;
  };

  // Setters e Getters

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public void setNum(int numero) {
    this.numero = numero;
  }

  public String getNome() {
    return this.titular.getNome();
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }
}