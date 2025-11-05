package contabancaria;

public class Agencia {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria("Bruno", 5000);

        minhaConta.setTitular("Bruno Rocha");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é: " + titularConta + " e o saldo final é R$" + saldoFinal);


    }
}
