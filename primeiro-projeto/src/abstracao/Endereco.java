package abstracao;

public abstract class Endereco {

    private String rua;
    private String cidade;
    private String numero;
    private String estado;
    private String cep;

    public Endereco(String rua, String cidade, String numero, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void mostrarEndereco(){
        System.out.println("Endereço: " + rua + "," + numero + ", " + cidade + ", " + estado + ", " + cep);
    }
}
