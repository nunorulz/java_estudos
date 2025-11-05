package contabancaria;

public class ContaBancaria {

    //Atributos privados

    private String titular;
    private double saldo;

    //Getter e Setter - Metodos padroes para acessar e modificar os atributos
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Construtor sem atributo
    public ContaBancaria() {
    }

    //Construtor com atributo
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}
