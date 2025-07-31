public final class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfosComuns();
        System.out.println("==============================\n");
    }

    @Override
    public String getTipo() {
        return "Conta Poupança";
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", cliente=" + cliente +
                '}';
    }
}

