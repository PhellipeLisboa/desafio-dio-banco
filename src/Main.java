public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        Cliente phellipe = new Cliente("Phellipe");
        Cliente pedro = new Cliente("Pedro");

        Conta cc = banco.criarContaCorrente(phellipe);
        cc.depositar(100);
        Conta cp = banco.criarContaPoupanca(phellipe);
        cc.transferir(100, cp);
        Conta cp2 = banco.criarContaPoupanca(pedro);

        cp.sacar(55);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.listarClientes();
    }
}
