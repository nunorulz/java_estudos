package excecao.verificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {

        BufferedReader bufferdReader = null;

        try {
            bufferdReader = new BufferedReader(new FileReader("C:\\HandsOn\\javanauta\\java_estudos\\primeiro-projeto\\src\\texto.txt"));
            String linha;
            while ((linha = bufferdReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}