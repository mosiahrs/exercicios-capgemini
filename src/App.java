import java.util.Scanner;

/*  Curso de Lógica para Programação III
    Instrutor: Marcio Michelluzzi 
*/

        //  Lista de exercícios I
public class App {
    public static void main(String[] args){
        
        //  1 - R:
            /*  try (Scanner leitorScanner = new Scanner(System.in)) {
            int a;
            int b;

            System.out.println("Digite um numero");
            a = leitorScanner.nextInt();
            
            System.out.println("Digite outro numero");
            b = leitorScanner.nextInt();

            System.out.println("");
            System.out.println(a + " + " + b + " = " + (a+b));
            }*/
           
            // 2 - R:
            /*
            try (Scanner sc1 = new Scanner(System.in)) {
            
            int a;
            int b;

            System.out.println("Digite um numero para operacao");
            a = sc1.nextInt();

            System.out.println("Digite o outro numero da operacao");
            b = sc1.nextInt();

            System.out.println("Operacao de Soma");
            System.out.println(a + " + " + b + " = " + (a+b));
            System.out.println("");

            System.out.println("Operacao de Subtracao");
            System.out.println(a + " - " + b + " = " + (a-b));
            System.out.println("");

            System.out.println("Operacao de Multiplicacao");
            System.out.println(a + " x " + b + " = " + (a*b));
            System.out.println("");

            System.out.println("Operacao de Divisao");
            System.out.println(a + " / " + b + " = " + (a/b));
            System.out.println("");

            }
            */
    
            // 3 - R:
            /*
            double mediaConsumo;
            double distanciaPercorrida = 300d;
            double combustivelGasto = 30d;

            mediaConsumo = distanciaPercorrida / combustivelGasto;

            System.out.println("A media de consumo eh " + mediaConsumo + "km/l");
            */

            /*4 Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
            - R: */
            
            String nomeVendedor;
            double salarioFixo;
            double totaldeVendas;
            double comissao = 0.15d;

            try (Scanner sc1 = new Scanner(System.in)) {
                System.out.println("Digite o nome do vendedor");
                nomeVendedor = sc1.nextLine();
                
                System.out.println("Digite seu salario fixo");
                salarioFixo = sc1.nextDouble();

                System.out.println("Qual foi o total de venda (em dinheiro)");
                totaldeVendas = sc1.nextDouble();
            }
            double salarioFinal = salarioFixo + (totaldeVendas*comissao);
            System.out.println("O salario de " + nomeVendedor + " esse mes sera de " + salarioFinal  +"R$");
                
    }
}
