import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public Conta criarContaCorrente(Cliente cliente) {
        ContaCorrente novaConta = new ContaCorrente(cliente);
        this.contas.add(novaConta);
        return novaConta;
    }

    public Conta criarContaPoupanca(Cliente cliente) {

        if (!cliente.podeTerContaPoupanca()) {
            throw new IllegalArgumentException("Apenas clientes do tipo pessoa física podem ter conta poupança.");
        }

        ContaPoupanca novaConta = new ContaPoupanca(cliente);

        this.contas.add(novaConta);
        return novaConta;
    }

    public void listarClientes() {

        System.out.println("============================= Lista de Clientes =============================");

        contas.stream().map(conta -> String.format("Titular: %-20s | Tipo Cliente: %-2s | Tipo Conta: %s",
                conta.cliente.getNome(),
                conta.cliente.getTipo(),
                conta.getTipo()))
                .distinct().forEach(System.out::println);

        System.out.println("=============================================================================");

    }

    public List<Conta> buscarContasPorCliente(Cliente cliente) {
        return contas.stream()
                .filter(conta -> conta.getCliente().equals(cliente))
                .toList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}

