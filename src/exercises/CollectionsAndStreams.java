package exercises;

import java.util.ArrayList;
import java.util.List;

public class CollectionsAndStreams {


    /**
     * Você está desenvolvendo um sistema para gerenciar os nomes dos funcionários de uma empresa de tecnologia. O sistema precisa permitir que novos funcionários sejam adicionados a uma lista de nomes.
     *
     * Sua tarefa é criar uma lista de strings e adicionar os nomes dos funcionários "João", "Maria", " Vitor" e “Ana” a essa lista. Depois, imprima a lista para verificar se os nomes foram adicionados corretamente.
     *
     * Saída esperada:
     *
     *  Lista de funcionários: [João, Maria, Vitor, Ana]
     */
    public static void exercise1() {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");
        System.out.println(funcionarios);
    }

    public static void exercise2() {

    }

}
