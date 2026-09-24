package nomes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Curso> listaGen;

        List lista = new ArrayList<Curso>();
        lista.add(new Bacharelado("Engenharia de Software", 01, 8, 813));
        lista.add(new Licenciatura("Matemática", 02, 8, 500));
        lista.add(new CursoTecnologo("Análise e desenvolvimento de sistemas", 03, 5, 700));

    }
}
