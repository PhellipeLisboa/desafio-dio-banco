public final class ClientePessoaJuridica extends Cliente{

    private String cnpj;

    public ClientePessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }


    @Override
    public boolean podeTerContaPoupanca() {
        return false;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getTipo() {
        return "pj";
    }

}
