public final class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
        System.out.println("==============================\n");
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", cliente=" + cliente +
                '}';
    }
}
