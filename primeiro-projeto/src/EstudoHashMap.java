import java.util.HashMap;

public class EstudoHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for(String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + ": " + nota);
        }
        System.out.println("_____________________________________");



        System.out.println("_____________________________________");

        double nota = notasAlunos.get("Alice");
        System.out.println("A nota da Alice é " + nota);

        System.out.println("_____________________________________");

    }

}
