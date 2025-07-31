public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        ClientePessoaFisica phellipe = new ClientePessoaFisica("Phellipe", "999.999.999.99");
        ClientePessoaJuridica phellipePJ = new ClientePessoaJuridica("Phellipe", "99.999.999/0001-99");
        ClientePessoaFisica pedro = new ClientePessoaFisica("Pedro", "222.222.222.22");

        System.out.println(banco.buscarContasPorCliente(phellipe));

        Conta cc = banco.criarContaCorrente(phellipe);
        Conta cp = banco.criarContaPoupanca(phellipe);

        System.out.println(banco.buscarContasPorCliente(phellipe));

//        cc.depositar(100);
//        Conta cp = banco.criarContaPoupanca(phellipe);
//        cc.transferir(100, cp);
//        Conta cp2 = banco.criarContaPoupanca(pedro);
//        Conta cp3 = banco.criarContaCorrente(phellipePJ);
//
//        cp.sacar(55);
//
//        cc.imprimirExtrato();
//        cp.imprimirExtrato();
//        cp2.imprimirExtrato();
//        cp3.imprimirExtrato();

        banco.listarClientes();
    }
}
