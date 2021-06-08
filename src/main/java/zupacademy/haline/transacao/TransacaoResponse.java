package zupacademy.haline.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import zupacademy.haline.transacoes.estabelecimento.EstabelecimentoRespon;

public class TransacaoResponse {

    private Long id;
    private BigDecimal valor;
    private LocalDateTime efetivadaEm;
    private EstabelecimentoRespon estabelecimento;

    public TransacaoResponse(Transacao transacao) {
        this.id = transacao.getId();
        this.valor = transacao.getValor();
        this.efetivadaEm = transacao.getEfetivadaEm();
        this.estabelecimento = new EstabelecimentoRespon(
                transacao.getEstabelecimento().getNome(),
                transacao.getEstabelecimento().getCidade(),
                transacao.getEstabelecimento().getEndereco()
        );
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EstabelecimentoRespon getEstabelecimento() {
        return estabelecimento;
    }
}
