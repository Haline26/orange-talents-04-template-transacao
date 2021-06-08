package zupacademy.haline.transacoes.estabelecimento;

public class EstabelecimentoRespon {

    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoRespon() {
    }

    public EstabelecimentoRespon(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "EstabelecimentoResponse{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
