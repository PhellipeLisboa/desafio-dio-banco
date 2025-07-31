public final class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("================================= Extrato Conta Poupança  =================================");
        imprimirInfosComuns();
        imprimirTransacoes();
        System.out.println("===========================================================================================\n");
    }

    @Override
    public String getTipo() {
        return "Conta Poupança";
    }

    @Override
    public String toString() {
        return String.format("%s {Agência: %d, Número: %d, Cliente: %s}",
                getTipo(), agencia, numero, cliente.getNome());
    }

}

