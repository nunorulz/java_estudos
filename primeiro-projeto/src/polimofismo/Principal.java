package polimofismo;

public class Principal {

    public static void main(String[] args) {
        int sabaoPo = 1;
        int mamao = 2;
        double sabonete = 2.5;
        double arroz = 5.9;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;

        int total = Calculadora.somar(sabaoPo, mamao);
        double totalDouble = Calculadora.somar(sabonete, arroz);
        Integer totalInteger = Calculadora.somar(batata, cenoura, melancia);

        Carro fusca = new Carro();
        fusca.mover();

    }

}
