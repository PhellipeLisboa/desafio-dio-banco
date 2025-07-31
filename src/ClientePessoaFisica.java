public final class ClientePessoaFisica extends Cliente{

    protected String cpf;

    public ClientePessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public boolean podeTerContaPoupanca() {
        return true;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String getTipo() {
        return "PF";
    }
}
