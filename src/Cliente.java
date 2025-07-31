public abstract sealed class Cliente permits ClientePessoaFisica, ClientePessoaJuridica {

    protected String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract boolean podeTerContaPoupanca();

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public abstract String getTipo();
}
