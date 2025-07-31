import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {

    private LocalDateTime dataHora;
    private TipoTransacao tipo;
    private double valor;
    private String descricao;

    public Transacao(TipoTransacao tipo, double valor, String descricao) {
        this.dataHora = LocalDateTime.now();
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {

        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dataHora.format(padrao);

        return String.format("[%s] %-25s R$ %.2f - %s", dataFormatada, tipo.name(), valor,
                descricao != null ? descricao : " ");
    }
}
