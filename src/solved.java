// 1 - R:
/*
 * try (Scanner leitorScanner = new Scanner(System.in)) {
 * int a;
 * int b;
 * 
 * System.out.println("Digite um numero");
 * a = leitorScanner.nextInt();
 * 
 * System.out.println("Digite outro numero");
 * b = leitorScanner.nextInt();
 * 
 * System.out.println("");
 * System.out.println(a + " + " + b + " = " + (a+b));
 * }
 */

// 2 - R:
/*
 * try (Scanner sc1 = new Scanner(System.in)) {
 * 
 * int a;
 * int b;
 * 
 * System.out.println("Digite um numero para operacao");
 * a = sc1.nextInt();
 * 
 * System.out.println("Digite o outro numero da operacao");
 * b = sc1.nextInt();
 * 
 * System.out.println("Operacao de Soma");
 * System.out.println(a + " + " + b + " = " + (a+b));
 * System.out.println("");
 * 
 * System.out.println("Operacao de Subtracao");
 * System.out.println(a + " - " + b + " = " + (a-b));
 * System.out.println("");
 * 
 * System.out.println("Operacao de Multiplicacao");
 * System.out.println(a + " x " + b + " = " + (a*b));
 * System.out.println("");
 * 
 * System.out.println("Operacao de Divisao");
 * System.out.println(a + " / " + b + " = " + (a/b));
 * System.out.println("");
 * 
 * }
 */

// 3 - R:
/*
 * double mediaConsumo;
 * double distanciaPercorrida = 300d;
 * double combustivelGasto = 30d;
 * 
 * mediaConsumo = distanciaPercorrida / combustivelGasto;
 * 
 * System.out.println("A media de consumo eh " + mediaConsumo + "km/l");
 */

/*
 * 4 Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o
 * total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu
 * nome, o salário fixo e salário no final do mês;
 * - R:
 * 
 * String nomeVendedor;
 * double salarioFixo;
 * double totaldeVendas;
 * double comissao = 0.15d;
 * 
 * try (Scanner sc1 = new Scanner(System.in)) {
 * System.out.println("Digite o nome do vendedor");
 * nomeVendedor = sc1.nextLine();
 * 
 * System.out.println("Digite seu salario fixo");
 * salarioFixo = sc1.nextDouble();
 * 
 * System.out.println("Qual foi o total de venda (em dinheiro)");
 * totaldeVendas = sc1.nextDouble();
 * }
 * double salarioFinal = salarioFixo + (totaldeVendas*comissao);
 * System.out.println("O salario de " + nomeVendedor + " esse mes sera de " +
 * salarioFinal +"R$");
 */

/*
 * 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três
 * provas que ele obteve no semestre. No finalinformar o nome do aluno e a sua
 * média (aritmética);
 * 
 * R:
 * 
 * try (Scanner sc1 = new Scanner(System.in)) {
 * String nomeAluno;
 * Double nota1;
 * Double nota2;
 * Double nota3;
 * Double mediaAritimetica;
 * 
 * System.out.println("Insira o nome do Aluno");
 * nomeAluno = sc1.nextLine();
 * 
 * System.out.println("Coloque as notas da 1 a 3");
 * nota1 = sc1.nextDouble();
 * nota2 = sc1.nextDouble();
 * nota3 = sc1.nextDouble();
 * 
 * mediaAritimetica = (nota1 + nota2 + nota3)/ 3;
 * 
 * System.out.println("O aluno" + nomeAluno + " possui nota " + mediaAritimetica
 * + " de Media.");
 */