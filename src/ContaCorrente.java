public final class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("================================= Extrato Conta Corrente  =================================");
        imprimirInfosComuns();
        imprimirTransacoes();
        System.out.println("===========================================================================================\n");
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }

    @Override
    public String toString() {
        return String.format("%s {Agência: %d, Número: %d, Cliente: %s}",
                getTipo(), agencia, numero, cliente.getNome());
    }

}
