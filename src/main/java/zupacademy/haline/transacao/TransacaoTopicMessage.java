package zupacademy.haline.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import zupacademy.haline.transacoes.cartao.CartaoResponse;
import zupacademy.haline.transacoes.estabelecimento.EstabelecimentoRespon;

public class TransacaoTopicMessage {

    private String id;
    private BigDecimal valor;
    private CartaoResponse cartao;
    private LocalDateTime efetivadaEm;
    private EstabelecimentoRespon estabelecimento;

    @Deprecated
    public TransacaoTopicMessage() {
    }

    public TransacaoTopicMessage(String id,
                                 BigDecimal valor,
                                 CartaoResponse cartao,
                                 LocalDateTime efetivadaEm,
                                 EstabelecimentoRespon estabelecimento) {
        this.id = id;
        this.valor = valor;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
        this.estabelecimento = estabelecimento;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public CartaoResponse getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public EstabelecimentoRespon getEstabelecimento() {
        return estabelecimento;
    }

    @Override
    public String toString() {
        return "TransacaoResponse{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                ", estabelecimento=" + estabelecimento +
                '}';
    }
}
