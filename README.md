# Java
Formulário Java, utilizando Scanner.


import java.util.Scanner;

/* Formulário criado com base em um cadastro de uma academia */

public class Formulario {

    public static void main(String[] args) {

        // Entrada de dados

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Vamos realizar seu cadastro, por favor, informe os dados solicitados a seguir =)");

            System.out.print("Nome completo: ");
            String nome = teclado.nextLine();

            System.out.print("Idade (Apenas números): ");
            int idade = teclado.nextInt();

            System.out.print("Sexo: ");
            String sexo = teclado.next();

            System.out.print("Altura (Exemplo 1,85): ");
            float altura = teclado.nextFloat();

            System.out.print("Peso (Apenas números): ");
            int peso = teclado.nextInt();

            System.out.print("CPF (Apenas números): ");
            String cpf = teclado.next();

            System.out.print("RG (Apenas números): ");
            String rg = teclado.next();

            System.out.print("Telefone (Apenas números, com DDD): ");
            String telefone = teclado.next();

            System.out.print("Plano desejado (Parcial ou Livre): ");
            String plano = teclado.next();

            System.out.println(
                    "***************************************************************************************************");
            System.out.println(
                    "***************************************************************************************************");

            // Saída de dados

            System.out.println(
                    "Obrigado por realizar seu cadastro, é um prazer tê-lo conosco, segue abaixo o resumo do seu cadastro =)");

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Sexo: " + sexo);
            System.out.println("Altura: " + altura);
            System.out.println("Peso: " + peso + " KG");
            System.out.println("CPF: " + cpf);
            System.out.println("RG: " + rg);
            System.out.println("Telefone: " + telefone);
            System.out.println("Plano: " + plano);

            if (plano.length() >= 6) {
                System.out.println("O valor do plano escolhido é de R$ 50,00 mensais.");
            }

            else {
                System.out.println("O valor do plano escolhido é de R$ 75,00 mensais.");
            }
        }
    }
}
