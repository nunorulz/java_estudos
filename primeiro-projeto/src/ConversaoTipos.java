public class ConversaoTipos {
    public static void main(String[] args) {
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Long numeroLong = 100L;
        String numeroLongToString = numeroLong.toString();


        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroLongToString);

        System.out.println();
    }
}
