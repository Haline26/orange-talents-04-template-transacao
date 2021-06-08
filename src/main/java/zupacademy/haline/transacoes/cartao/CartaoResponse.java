package zupacademy.haline.transacoes.cartao;

public class CartaoResponse {

    private String id;
    private String email;


    @Deprecated
    public CartaoResponse() {
    }

    public CartaoResponse(String id, String email) {
        this.id = id;
        this.email = email;

    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CartaoRespon{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
