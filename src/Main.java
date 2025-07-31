public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Banco Virtual DIO");

        ClientePessoaFisica phellipe = new ClientePessoaFisica("Phellipe", "999.999.999-99");
        ClientePessoaFisica pedro = new ClientePessoaFisica("Pedro", "222.222.222-22");
        ClientePessoaJuridica empresa = new ClientePessoaJuridica("Empresa XYZ", "99.999.999/0001-99");

        Conta contaCorrentePhellipe = banco.criarContaCorrente(phellipe);
        Conta contaPoupancaPhellipe = banco.criarContaPoupanca(phellipe);

        Conta contaCorrentePedro = banco.criarContaCorrente(pedro);
        Conta contaPoupancaPedro = banco.criarContaPoupanca(pedro);

        Conta contaCorrenteEmpresa = banco.criarContaCorrente(empresa);

        // DEVERIA FALHAR.
        try {
            Conta contaPoupancaEmpresa = banco.criarContaPoupanca(empresa);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar conta poupança para PJ: " + e.getMessage());
        }

        contaCorrentePhellipe.depositar(500);
        contaCorrentePhellipe.transferir(150, contaPoupancaPhellipe);
        contaPoupancaPhellipe.sacar(55);

        contaCorrentePedro.depositar(300);
        contaCorrentePedro.transferir(100, contaPoupancaPedro);
        contaPoupancaPedro.sacar(50);

        contaCorrenteEmpresa.depositar(1000);
        contaCorrenteEmpresa.transferir(250, contaCorrentePhellipe);

        contaCorrentePhellipe.imprimirExtrato();
        contaPoupancaPhellipe.imprimirExtrato();
        contaCorrentePedro.imprimirExtrato();
        contaPoupancaPedro.imprimirExtrato();
        contaCorrenteEmpresa.imprimirExtrato();

        banco.listarClientes();

        System.out.println("\nContas de Phellipe:");
        banco.buscarContasPorCliente(phellipe).forEach(System.out::println);

        System.out.println("\nContas de Pedro:");
        banco.buscarContasPorCliente(pedro).forEach(System.out::println);

        System.out.println("\nContas da Empresa:");
        banco.buscarContasPorCliente(empresa).forEach(System.out::println);
    }
}
