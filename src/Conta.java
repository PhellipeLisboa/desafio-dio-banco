public abstract sealed class Conta implements IConta permits ContaPoupanca, ContaCorrente {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s \n", this.cliente.getNome());
        System.out.printf("Tipo de conta: %s \n", this.cliente.getTipo());
        System.out.printf("Agência: %d \n", this.agencia);
        System.out.printf("Número: %d \n", this.numero);
        System.out.printf("Saldo: R$ %.2f \n", this.saldo);
    }


    public abstract String getTipo();
}
