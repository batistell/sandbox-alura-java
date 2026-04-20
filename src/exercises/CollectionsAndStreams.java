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


    /**
     * Você está trabalhando no sistema de gestão de uma escola, garantindo que a lista de estudantes esteja sempre correta. Durante uma revisão nos cadastros, percebeu que um nome foi adicionado incorretamente: “Pedro”. Para evitar confusões na emissão de certificados e registros, você precisa corrigir essa informação imediatamente.
     *
     * Sua tarefa é remover o nome “Pedro” da lista. Considere que a lista inicial possui os seguintes nomes: Joana, Lucas, Pedro e Antônio.
     *
     * Saída esperada:
     *
     * Lista inicial: [Joana, Lucas, Pedro, Antônio]
     * Lista após a exclusão: [Joana, Lucas, Antônio]
     */
    public static void exercise2() {
        List<String> estudantes = new ArrayList<>(List.of("Joana", "Lucas", "Pedro", "Antônio"));
        estudantes.remove("Pedro");
        System.out.println(estudantes);
    }

    /**
     * Você faz parte da equipe de tecnologia de uma empresa que precisa garantir que o cadastro de funcionários esteja sempre atualizado. Hoje, você recebeu uma solicitação para manter o controle de acesso à empresa. Para isso, seu código deve ser capaz de:
     *
     * Verificar quantos funcionários estão registrados
     * Descobrir o nome do segundo funcionário da lista
     * Exemplo de entrada:
     *
     * funcionarios.add("João");
     * funcionarios.add("Maria");
     * funcionarios.add("Ana");
     * funcionarios.add("Pedro");
     * funcionarios.add("Antônio");
     * Copiar código
     * Saída esperada:
     *
     * A segunda pessoa da lista é: Maria
     * Total de funcionários: 5
     */
    public static void exercise3() {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        if (funcionarios.size() > 1) {
            System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
        }
        System.out.println("Total de funcionários: " + funcionarios.size());
    }

}
