package logicasequencial;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;

        System.out.println("Valor total = R$" + valorTotalComDesconto);
    }

}
