package heranca;

public class Principal {

    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.comer("Grão de milho");
        gertrudez.beberAgua();
        gertrudez.dormir();

    }

}
