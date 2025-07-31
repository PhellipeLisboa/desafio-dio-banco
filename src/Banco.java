import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public Conta criarContaCorrente(Cliente cliente) {
        Conta novaConta = new ContaCorrente(cliente);
        this.contas.add(novaConta);
        return novaConta;
    }

    public Conta criarContaPoupanca(Cliente cliente) {
        Conta novaConta = new ContaPoupanca(cliente);
        this.contas.add(novaConta);
        return novaConta;
    }

    public void listarClientes() {

        List<Cliente> clientes = new ArrayList<>();
        for (Conta conta : contas) {
            clientes.add(conta.getCliente());
        }
        System.out.println("Clientes: " + clientes);

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

