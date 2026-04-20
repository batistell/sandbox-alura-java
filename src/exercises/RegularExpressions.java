package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    /**
     *Joana está desenvolvendo um sistema de cadastro de usuários e percebeu que muitos nomes estão sendo cadastrados com espaços em branco no início ou no final. Ela quer um programa que remova esses espaços automaticamente.
     *
     * Crie um programa que receba um nome e exiba o nome sem espaços em branco no início ou no final.
     *
     * Exemplo de entrada:
     *
     * Digite o nome:    João Silva
     * Copiar código
     * Saída esperada:
     *
     * Nome sem espaços: João Silva
     */
    public static void exercise1(String name) {
        System.out.println(name.trim());
    }

    /**
     *Carlos está desenvolvendo um sistema de relatórios e precisa padronizar o texto para que todos os títulos estejam em maiúsculas e as descrições em minúsculas. Faça um programa que receba um texto e exiba o texto em maiúsculas e o texto em minúsculas.
     *
     * Exemplo de entrada:
     *
     * Digite o texto: Olá, Mundo!
     * Copiar código
     * Saída esperada:
     *
     * Texto em maiúsculas: OLÁ, MUNDO!
     * Texto em minúsculas: olá, mundo!
     */
    public static void exercise2(String text) {
        System.out.println("Texto em Maiúsculas: " + text.toUpperCase());
        System.out.println("Texto em Minúsculas: " + text.toLowerCase());
    }

    /**
     *Ana está desenvolvendo um sistema de edição de textos e precisa substituir uma palavra específica por outra em um texto. Crie um programa que:
     *
     * Receba um texto, uma palavra a ser substituída e uma nova palavra, exiba o texto com as substituições realizadas.
     * Se a palavra a ser substituída não for encontrada no texto, o programa deve informar ao usuário que a palavra não foi encontrada e encerrar a execução.
     * Exemplo de entrada:
     *
     * Digite o texto: O gato caça o rato.
     * Digite a palavra a ser substituída: gato
     * Digite a nova palavra: cachorro
     * Copiar código
     * Saída esperada:
     *
     * Texto modificado: O cachorro caça o rato.
     */
    public static void exercise3(String texto, String palavra, String novaPalavra) {
        System.out.println("Texto modificado: " + texto.replace(palavra, novaPalavra));
    }

    /**
     * Pedro está desenvolvendo um sistema de processamento de arquivos e precisa extrair o nome do arquivo sem a extensão. Crie um programa que receba o nome de um arquivo e exiba o nome sem a extensão.
     *
     * Exemplo de entrada:
     *
     * Digite o nome do arquivo: relatorio_final.pdf
     * Copiar código
     * Saída esperada:
     *
     * Nome do arquivo sem extensão: relatorio_final
     */
    public static void exercise4(String fileName) {
        Pattern pattern = Pattern.compile("(\\w+)\\.(\\w+)");
        Matcher matcher = pattern.matcher(fileName);

        if (matcher.matches()) {
            String nomeSemExtensao = matcher.group(1);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        } else {
            System.out.println("Nome do arquivo com extensão: " + fileName);
        }
    }

    /**
     * Laura está desenvolvendo um sistema de busca e precisa verificar se uma palavra específica está presente em um texto. Crie um programa que receba um texto e uma palavra, e exiba uma mensagem indicando se a palavra está presente no texto.
     *
     * Exemplo de entrada:
     *
     * Digite o texto: O gato caça o rato.
     * Digite a palavra: gato
     * Copiar código
     * Saída esperada:
     *
     * A palavra "gato" está presente no texto.
     */
    public static void exercise5(String texto, String palavra) {
        if (texto.contains(palavra)) {
            System.out.println("A palavra "+ palavra + " está presente no texto");
        }
    }

    /**
     * Roberto está desenvolvendo um sistema de relatórios financeiros e precisa formatar valores monetários com duas casas decimais. Construa um programa que receba um valor monetário e exiba o valor formatado com duas casas decimais.
     *
     * Exemplo de Entrada:
     *
     * Digite o valor: 19,9876
     * Copiar código
     * Saída esperada:
     *
     * Valor formatado: R$ 19,99
     */
    public static void exercise6(double valor) {
        System.out.printf("Valor formatado: R$ %.2f %n", valor);
    }

    /**
     * Pedro está desenvolvendo um sistema de controle de produtos e precisa verificar se os códigos de referência dos produtos seguem o formato correto. O formato do código de referência é composto por:
     *
     * 3 letras maiúsculas
     * Um hífen
     * 4 dígitos numéricos Crie um programa que receba um código de referência e informe se ele está no formato correto.
     * Exemplo de entrada:
     *
     * Digite o código de referência: ABC-1234
     * Copiar código
     * Saída esperada:
     *
     * O código de referência está válido.
     */
    public static void exercise7(String codigo) {
        Pattern pattern = Pattern.compile("[A-Z]{3}-\\d{4}");
        Matcher matcher = pattern.matcher(codigo);
        if (matcher.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência está inválido.");
        }
    }

    /**
     * Roberto está desenvolvendo um sistema de cadastro de clientes e precisa validar os números de CPF fornecidos. Ele quer um programa que verifique se o CPF está no formato correto (XXX.XXX.XXX-XX).
     *
     * Crie um programa que receba um CPF e exiba uma mensagem indicando se o CPF está no formato válido.
     *
     * Exemplo de entrada:
     *
     * Digite o CPF: 123.456.789-09
     * Copiar código
     * Saída esperada:
     *
     * O CPF 123.456.789-09 está no formato válido.
     */
    public static void exercise8(String cpf) {
        Pattern pattern = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}");
        Matcher matcher = pattern.matcher(cpf);
        if (matcher.matches()) {
            System.out.println("O CPF " + cpf + " está no formato válido");
        } else {
            System.out.println("O cpf de referência está inválido. " + cpf);
        }
    }

    /**
     * Patrícia está desenvolvendo um sistema de análise de redes sociais e precisa extrair todas as hashtags de um texto. Ela quer um programa que encontre todas as palavras que começam com "#".
     *
     * Crie um programa que receba um texto e exiba todas as hashtags encontradas.
     *
     * Exemplo de entrada:
     *
     * Digite o texto: Olá #mundo! Estou aprendendo #Java e #programação.
     * Copiar código
     * Saída esperada:
     *
     * Hashtags encontradas: #mundo, #Java, #programação
     */
    public static void exercise9(String texto) {
        Pattern pattern = Pattern.compile("[#][\\w+]+");
        Matcher matcher = pattern.matcher(texto);
        List<String> resultados = new ArrayList<>();

        while (matcher.find()) {
            resultados.add(matcher.group());
        }

        System.out.println("Hashtags encontradas: " + resultados);
    }

    /**
     * Carla está desenvolvendo um sistema de cadastro de usuários e precisa validar as senhas. A senha deve ter pelo menos:
     *
     * 8 caracteres
     * Uma letra maiúscula
     * Uma letra minúscula
     * Um número
     * Um caractere especial
     * Crie um programa que receba uma senha e exiba uma mensagem indicando se a senha é válida ou não.
     *
     * Exemplo de entrada:
     *
     * Digite a senha: Senha123!
     * Copiar código
     * Saída esperada:
     *
     * A senha é válida.
     */
    public static void exercise10(String senha) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W).{8,}$");
        Matcher matcher = pattern.matcher(senha);
        if (matcher.matches()) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha é inválida.");
        }
    }

    /**
     *
     */
    public static void exercise() {
    }

}
