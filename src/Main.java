import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Faça um programa para o cálculo de uma folha de pagamento. Para
        isso, o sistema deve saber o valor do salário.
                Com base na descrição abaixo, exiba os descontos do IR:
                • Salário até R$900,00 (inclusive) – Isento;
                • Salário de R$901,00 até R$ 1500, 00 (inclusive) – desconto de 5%;
                • Salario de1501,00 até R$ 2500,00 (Inclusive) – desconto de 10%;
                 • Salário acima de 2500 – Desconto de 20%.*/

        Scanner scanner = new Scanner(System.in);
        double salario = 0;
        int opcao = 1;
        double imposto;


        while (opcao != 0) {
            System.out.println("---- IMPOSTO DE RENDA ----");
            System.out.println(" 1 - Calcular seu imposto ");
            System.out.println(" 0 - sair");
            System.out.println("--------------------------");


            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o seu salário? ");
                    salario = scanner.nextDouble();

                    if (salario <= 900) {
                        System.out.println("Você está isento de pagar Imposto.");
                    } else if(salario > 900 && salario <= 1500) {

                        imposto = salario * 0.05;

                        System.out.println("5% de imposto.");
                        System.out.println("Seu salário liquido é R$" + (salario - imposto));

                    } else if(salario > 1500 && salario <= 2500){
                        imposto = salario * 0.10;

                        System.out.println("10% de imposto");
                        System.out.println("Seu salário liquido é R$" + (salario - imposto));
                    } else {
                        imposto = salario * 0.20;

                        System.out.println("20% de imposto");
                        System.out.println("Seu salário liquido é R$" + (salario - imposto));
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por usar nossos serviços. :D");
                    break;
                default:
                    System.out.println("Opção inválida. tente novamente.");

            }

        }

        scanner.close();

    }
}