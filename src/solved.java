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
/*
 * 6 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * int a;
 * int b;
 * int c;
 * 
 * System.out.println("Digite o valor de A:");
 * a = leitor.nextInt();
 * System.out.println("Digite o valor de B:");
 * b = leitor.nextInt();
 * 
 * c = a;
 * a = b;
 * b = c;
 * 
 * System.out.println("O valor da variavel A é: " + a);
 * System.out.println("O valor da variavel B é: " +b);
 * 
 */
/*
 * 7 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * String temperaturaAtual;
 * Double C;
 * Double F;
 * 
 * System.out.println("Digite a temperatura em Celsius  (C)");
 * C = leitor.nextDouble();
 * 
 * F = ((9*C)+160) / 5;
 * 
 * System.out.println("A temperatura em Fahrenheit é: " + F + "F");
 */
/*
 * 8 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * Double valorReal;
 * Double cotacaoDolar;
 * int quantDolar;
 * 
 * System.out.println("Digite o valor atual da cotacao do dolar");
 * cotacaoDolar = leitor.nextDouble();
 * 
 * System.out.println("Quantos dólares você possui? Para conversão: ");
 * quantDolar = leitor.nextInt();
 * 
 * valorReal = cotacaoDolar*quantDolar;
 * 
 * System.out.println("O valor em real é " + valorReal + " R$");
 */
/*
 * 9 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * Double deposito;
 * int qtdMeses = 12;
 * Double juros = 0.0007d;
 * Double rendimento;
 * Double saldo = 0.00d;
 * 
 * System.out.println("Digite o Valor que deseja depositar: ");
 * deposito = leitor.nextDouble();
 * 
 * saldo = deposito+saldo;
 * rendimento = deposito+(saldo*juros)*qtdMeses;
 * 
 * System.out.println("O valor do rendimento após " + qtdMeses + " mêses é: " +
 * rendimento + " R$");
 */
/*
 * 10 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * Double valorProduto;
 * Double valorPrestacao;
 * int quantidadePrestacao;
 * Double juros;
 * 
 * System.out.println("Digite o valor do Produto");
 * valorProduto = leitor.nextDouble();
 * 
 * System.out.println("Deseja parcelar em quantas vezes :");
 * quantidadePrestacao = leitor.nextInt();
 * 
 * 
 * if (quantidadePrestacao <= 5){
 * juros = 0d;
 * }else{
 * juros = valorProduto * 0.001d;
 * }
 * 
 * valorPrestacao = (valorProduto/quantidadePrestacao)+juros;
 * 
 * System.out.print(
 * "O produto ficara em " + quantidadePrestacao + " vezes "
 * + "de ");
 * System.out.println(String.format("%.2f", valorPrestacao) + " R$");
 */
/*
 * 11 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * Double precoCusto;
 * Double lucro;
 * Double precoVenda;
 * 
 * System.out.println("Digite o valor de custo do produto: ");
 * precoCusto = leitor.nextDouble();
 * 
 * System.out.println("Qual a porcentagem de lucro (numero decimal)");
 * lucro = leitor.nextDouble();
 * 
 * precoVenda = precoCusto + (precoCusto*lucro);
 * 
 * System.out.println("O valor de venda do produto é: " +
 * precoVenda + " R$");
 */
/*
 * 12 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * Double custoConsumidor;
 * Double custoFabrica;
 * Double percDistribuidor;
 * Double impostos;
 * 
 * System.out.println("Digite o custo de fabrica do veículo: ");
 * custoFabrica = leitor.nextDouble();
 * 
 * percDistribuidor = (custoFabrica*28)/100;
 * System.out.println("distribuidor= " + percDistribuidor);
 * 
 * impostos = (custoFabrica+percDistribuidor)*0.45d;
 * System.out.println("impostos= " + impostos);
 * 
 * custoConsumidor = custoFabrica + percDistribuidor + impostos;
 * System.out.println("O custo para o cliente final é de " +
 * custoConsumidor + "R$");
 */
/*
 * 13 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * System.out.println("Digite um numero:");
 * int valor = leitor.nextInt();
 * 
 * if (valor > 10){
 * System.out.println("O valor é maior que 10");
 * }else if (valor == 10){
 * System.out.println("O valor é igual a 10");
 * }else{
 * System.out.println("O valor é menor que 10");
 * }
 */
/*
 * 14 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * System.out.println("Digite o valor de A e B: ");
 * int a = leitor.nextInt();
 * int b = leitor.nextInt();
 * 
 * if (a > b){
 * System.out.println("O valor de A é maior que B");
 * }else if ( a == b){
 * System.out.println("O valor de A é igual a B");
 * }else{
 * System.out.println("O valor de B é maior que A");
 * }
 */
/*
 * 15 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * System.out.println("Digite um numero");
 * int a = leitor.nextInt();
 * 
 * 
 * if(a >= 100 & a <=200){
 * System.out.println("O numero está entre 100 e 200");
 * }else {
 * System.out.println("O numero não está entre 100 e 200");
 * }
 */
/*
 * 16 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * System.out.println("Digite as notas do semestre: ");
 * Double n1 = leitor.nextDouble();
 * Double n2 = leitor.nextDouble();
 * Double n3 = leitor.nextDouble();
 * 
 * Double media = (n1+n2+n3)/3;
 * 
 * if (media >=7){
 * System.out.println(String.format("%.1f", media) + " = Aprovado");
 * }else if (media > 5.1 & media < 6.9){
 * System.out.println(String.format("%.1f", media) + " = Recuperação");
 * }else{
 * System.out.println(String.format("%.1f", media) + " = Reprovado");
 * }
 */
/*
 * 17 - R:
 * import java.util.Random;
 * Random gerador = new Random();
 * int count = 0;
 * 
 * for (int i = 0; i < 80; i++) {
 * int n = gerador.nextInt(300);
 * System.out.println(n);
 * if (n >= 10 & n <= 150) {
 * count++;
 * }
 * }
 * System.out.println("");
 * System.out.println("Foram " + count + " dentro do Intervalo na rodada");
 */
/*
 * 18 - R:
 * 
 * Random gerador = new Random();
 * 
 * for (int i = 0; i < 75; i++) {
 * int idade = gerador.nextInt(65);
 * 
 * if (idade >= 18) {
 * System.out.println(idade + " anos" + " - Maior de Idade");
 * }else {
 * System.out.println(idade + " anos" + " - Menor de Idade");
 */
/*
 * 19 - R:
 * 
 * // Aleatorio - s/nome
 * 
 * Random gerador = new Random();
 * int h = 0;
 * int m = 0;
 * 
 * for (int i = 1; i < 56; i++) {
 * int n = gerador.nextInt(2);
 * 
 * if (n == 0) {
 * h++;
 * System.out.println("A pessoa " + i + " é Homem");
 * } else {
 * m++;
 * System.out.println("A pessoa " + i + " é Mulher");
 * }
 * 
 * }
 * System.out.println("Das 56 pessoas " + h + " são homens e "
 * + m + " são mulheres!");
 * 
 * // Com entradas do Usuário
 * 
 * Scanner leitor = new Scanner(System.in);
 * int h = 0;
 * int m = 0;
 * 
 * for (int i = 0; i < 56; i++) {
 * System.out.println("Digite seu nome");
 * String nome = leitor.nextLine();
 * System.out.println("Digite seu genero (h - homem & m - mulher");
 * char genero = leitor.nextLine().charAt(0);
 * 
 * if (genero == 'h') {
 * h++;
 * System.out.println("Olá " + nome + " você é " + " Homem");
 * } else {
 * m++;
 * System.out.println("Olá " + nome + " você é " + " Mulher");
 * }
 * }
 * System.out.println("Total de " + h + " Homens e total de " + m +
 * " Mulheres");
 */