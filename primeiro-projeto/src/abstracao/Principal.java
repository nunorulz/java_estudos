package abstracao;

public class Principal {

    public static void main(String[] args) {

        Funcionario joao = new Funcionario("Rua das Flores", "Recife", "1000", "Pernambuco", "50100-000", "João Paulo", "012.345.678-90", "Vendedor");
        Cliente joana = new Cliente("Rua do Outono", "Recife", "Pernambuco", "50720-500", "Joana Margarida", "012.345.678.98");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }

}
