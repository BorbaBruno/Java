
/**
 * Simulado de um sistema de cadastro de uma academia, que imprime na tela as informações cadastradas.
 */

import java.util.*;

public class Simulado {
    public static void main(String[] args) {

        // Entrada de dados cadastrais.

        try (Scanner tecladoTexto = new Scanner(System.in)) {
            try (Scanner tecladoNumero = new Scanner(System.in)) {
                System.out.println("Vamos realizar seu cadastro, por favor, informe os dados solicitados a seguir =)");
                System.out.print("Digite seu nome: ");
                String nome = tecladoTexto.nextLine();
                System.out.print("Digite sua idade: ");
                int idade = tecladoNumero.nextInt();
                System.out.print("Sexo M/F: ");
                String sexo = tecladoTexto.nextLine();
                System.out.print("Digite seu CPF: ");
                String cpf = tecladoTexto.nextLine();
                System.out.print("Digite seu RG: ");
                int rg = tecladoNumero.nextInt();
                System.out.print("Digite seu telefone com DDD: ");
                String telefone = tecladoTexto.nextLine();
                System.out.print("Digite sua altura, exemplo 1.80: ");
                float altura = tecladoNumero.nextFloat();
                System.out.print("Digite seu peso, exemplo 80.5: ");
                float peso = tecladoNumero.nextFloat();
                System.out.print("Digite o plano desejado, PARCIAL ou LIVRE: ");
                String plano = tecladoTexto.nextLine();

                System.out.println(
                        "***************************************************************************************************");
                System.out.println(
                        "***************************************************************************************************");

                // Saída de dados cadastrais.
                System.out.println(
                        "Obrigado por realizar seu cadastro, é um prazer tê-lo conosco, segue abaixo o resumo do seu cadastro =)");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade + " anos");
                System.out.println("Sexo: " + sexo);
                System.out.println("CPF: " + cpf);
                System.out.println("RG: " + rg);
                System.out.println("Telefone: " + telefone);
                System.out.println("Altura: " + altura);
                System.out.println("Peso: " + peso);
                System.out.println("Plano desejado: " + plano);

                if (plano.equalsIgnoreCase("parcial")) {
                    System.out.println("O valor do plano escolhido é de R$ 50,00 mensais.");
                } else {
                    System.out.println("O valor do plano escolhido é de R$ 75,00 mensais.");
                }
            }
        }
    }
}
