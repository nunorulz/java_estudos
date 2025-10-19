import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {

    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão");

        listaDeCompras.add(1,"Banana");

        for(String item : listaDeCompras){
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);

        listaDeCompras.remove(3);
        for(String item2 : listaDeCompras){
            System.out.println(item2);
        }

        System.out.println("_________________________________________");

        int tamanhoDaLista = listaDeCompras.size();
        boolean eVazia = listaDeCompras.isEmpty();

        System.out.println(tamanhoDaLista);

        System.out.println("_________________________________________");

        listaDeCompras.forEach(produto -> System.out.println(produto));
    }



}
