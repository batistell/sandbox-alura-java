package exercises;

import java.util.*;

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


    /**
     * Você é uma pessoa desenvolvedora de software responsável por otimizar o sistema de gestão de eventos de uma empresa. Recentemente, a organização relatou um problema: eventos duplicados estão aparecendo na lista de cadastros, o que pode gerar inconsistências nos relatórios e dificultar processos administrativos.
     *
     * Sua tarefa é exibir a lista de eventos sem valores duplicados.
     *
     * Exemplo de entrada:
     *
     * eventos.add("IA Conference Brasil");
     * eventos.add("AI Summit");
     * eventos.add("DevFest");
     * eventos.add("Cloud Expo");
     * eventos.add("IA Conference Brasil");
     * eventos.add("DevFest");
     * Copiar código
     * Saída esperada:
     *
     * Lista de eventos: [DevFest, AI Summit, Cloud Expo, IA Conference Brasil]
     */
    public static void exercise4() {
        Set<String> eventos = new HashSet<>();
        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");
        System.out.println("Lista de eventos: " + eventos);
    }


    /**
     * Você foi encarregado de desenvolver um sistema para gerenciar os clientes de uma livraria. Para garantir um controle preciso dos registros, cada cliente deve possuir um ID único associado ao seu nome.
     *
     * Para resolver essa tarefa você deve:
     *
     * Armazenar os clientes através de uma chave e valor: (id, nome)
     * Cadastrar três clientes
     * Recuperar o nome do cliente de ID igual a 2
     * Saída esperada:
     *
     * O nome do cliente com ID 2 é: Marcos
     */
    public static void exercise5() {
        HashMap<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "João");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));
    }


    /**
     * Você é uma pessoa desenvolvedora que está criando um sistema de gerenciamento de clientes para uma empresa. A equipe de atendimento precisa acessar os dados dos clientes cadastrados no sistema através de um ID e conta com sua ajuda para implementar este sistema de busca.
     *
     * Sua tarefa é:
     *
     * Armazenar os clientes através de um Map<Integer, String>, onde a chave é o ID e o valor é o nome.
     * Cadastrar cinco clientes no sistema.
     * Verificar se um ID específico existe antes de tentar recuperar o nome do cliente.
     * Se a chave existir, você pode acessar o nome associado; caso contrário, exiba uma mensagem informando que o cliente não foi encontrado.
     * Exemplo de entrada:
     *
     * clientes.put(1, "Maria");
     * clientes.put(2, "Marcos");
     * clientes.put(3, "Ana");
     * clientes.put(4, "Joana");
     * clientes.put(5, "Karen");
     * Copiar código
     * Saída esperada:
     *
     * Caso o cliente exista:
     *
     * O nome do cliente com ID 5 é: Karen
     * Copiar código
     * Caso não exista:
     *
     *  Cliente com ID 6 não encontrado.
     */
    public static void exercise6(int id) {
        HashMap<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        if (clientes.containsKey(id)) {
            System.out.println("O nome do cliente com ID " + id + " é: " + clientes.get(id));
        } else {
            System.out.println("Cliente com ID " + id + " não encontrado.");
        }
    }


    /**
     * Imagine que a equipe de RH precisa gerar relatórios específicos com listas de funcionários cujos nomes tenham um determinado número de caracteres ou menos para facilitar segmentações internas. Para isso, você deve ajudá-los desenvolvendo um programa capaz de:
     *
     * Criar uma lista contendo os nomes dos funcionários.
     * Filtrar apenas os nomes que tenham menos de 5 caracteres ou exatamente 5 caracteres.
     * Criar uma lista contendo os nomes filtrados.
     * Exibir a lista filtrada no console.
     * Exemplo de entrada:
     *
     * List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
     * Copiar código
     * Saída esperada:
     *
     * [Ana, Bruno, Alice]
     */
    public static void exercise7() {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
        List<String> funcionariosFiltrados = funcionarios.stream().filter(f -> f.length() <= 5).toList();
        System.out.println(funcionariosFiltrados);
    }


    /**
     * Você está desenvolvendo uma aplicação matemática que precisa calcular o quadrado de uma lista de números. Essa funcionalidade será usada para gerar gráficos e análises estatísticas. Para resolver essa tarefa você deve:
     *
     * Criar uma lista contendo os números fornecidos.
     * Calcular o quadrado de cada número utilizando o método map.
     * Criar uma nova lista contendo os resultados.
     * Exibir a lista de quadrados no console.
     * Exemplo de entrada:
     *
     * List<Integer> numeros = List.of(2, 3, 5, 7, 11);
     * Copiar código
     * Saída esperada:
     *
     *  Quadrados dos números: [4, 9, 25, 49, 121]
     */
    public static void exercise8() {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> squares = numeros.stream().map(n -> n * n).toList();
        System.out.println("Quadrados dos números: " + squares);
    }


    /**
     * Imagine que você trabalha no setor financeiro de uma empresa e precisa calcular o valor total gasto na compra de produtos. No entanto, a empresa precisa considerar um imposto de 8% sobre o valor total para definir corretamente o preço final dos produtos.
     *
     * Crie um programa que:
     *
     * Crie uma lista contendo os preços dos produtos.
     * Utilize reduce() para calcular o total gasto.
     * Calcule o valor do imposto (8%) sobre o total.
     * Exiba o valor total antes e depois da aplicação do imposto, com duas casas decimais.
     * Exemplo de entrada:
     *
     * List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
     * Copiar código
     * Saída esperada:
     *
     * Valor total antes do imposto: 195.23
     * Valor total com imposto de 8%: 210.85
     */
    public static void exercise9() {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalGasto = precosProdutos.stream().reduce(0.0, Double::sum);
        double imposto = totalGasto * 0.08;
        double valorTotalComImposto = totalGasto + imposto;

        System.out.printf("Valor total antes do imposto: %.2f \n", totalGasto);
        System.out.printf("Valor total com imposto de 8 porcento: %.2f \n", valorTotalComImposto);
    }


    /**
     *Você deseja analisar as notas dos alunos e alunas em uma disciplina para entender melhor o desempenho da turma.
     * Além da média, você também quer saber a menor e a maior nota para ter um panorama completo. Para isso, você deve criar um programa que seja capaz de:
     *
     * Criar uma lista contendo as notas dos alunos.
     * Utilizar reduce() para calcular a soma total das notas.
     * Calcular a média das notas.
     * Determinar a menor e a maior nota da lista. Dica: use a função max e min da classe Stream.
     * Exibir os resultados no console.
     * Exemplo de entrada:
     *
     * List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
     * Copiar código
     * Saída esperada:
     *
     * A média das notas é: 8.2
     * A menor nota foi: 6.5
     * A maior nota foi: 10.0
     */
    public static void exercise10() {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double media = notas.stream().reduce(0.0, Double::sum) / notas.size();
        double min = notas.stream().min(Double::compare).orElse(0.0);
        double max = notas.stream().max(Double::compare).orElse(0.0);

        System.out.printf("A média das notas é: %.2f \n", media);
        System.out.printf("A menor nota foi: %.2f \n", min);
        System.out.printf("A maior nota foi: %.2f \n", max);
    }

    /**
     *
     */
    public static void exercise() {
    }
}
