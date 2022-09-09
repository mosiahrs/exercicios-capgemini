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
/* 20 - R:
 * Scanner leitor = new Scanner(System.in);
 * 
 * Double valorCarro;
 * Double desconto;
 * Double valorFinal;
 * int anoVeiculo;
 * char resposta = 'S';
 * 
 * while (resposta == 'S' || resposta == 's') {
 * 
 * System.out.println("Digite o ano do veiculo");
 * anoVeiculo = leitor.nextInt();
 * 
 * System.out.println("Digite o valor do veiculo");
 * valorCarro = leitor.nextDouble();
 * 
 * if (anoVeiculo <= 2000) {
 * desconto = (valorCarro * 12) / 100;
 * } else {
 * desconto = (valorCarro * 7) / 100;
 * }
 * valorFinal = valorCarro - desconto;
 * 
 * System.out.println("O cliente vai receber " + desconto + " R$ "
 * + " de desconto");
 * 
 * System.out.println("Sera pago " + valorFinal + " R$");
 * 
 * System.out.println("Deseja continuar? S para sim e N para não");
 * resposta = leitor.next().charAt(0);
 * }
 * System.out.println("Programa encerrado!");
 */
/* 21 - R: 
        Scanner leitor = new Scanner(System.in);

        int n;
        int i = 0;

        System.out.println("Digite a quantidade de pessoas");
        n = leitor.nextInt();

        while (i < n) {
            System.out.println("Digite seu nome do candidato");
            String nome = leitor.next();
            System.out.println("Digite o genero (h - homem | m - mulher )");
            char genero = leitor.next().charAt(0);
            System.out.println("Digite a idade");
            int idade = leitor.nextInt();
            System.out.println("Passou no teste de saude (s- sim | n - não)");
            char saude = leitor.next().charAt(0);

            if (genero != 'h') {
                System.out.println(
                        nome + " é mulher, serviço militar no Brail"
                        + " é obrigatório somente para homens! ");
            } else {
                if (idade < 18) {
                    System.out.println(nome + " é menor de idade,"
                            + "o serviço militar é obrigatório somente maiores! ");
                } else {
                    if (saude != 's') {
                        System.out.println(nome + " Não passou no exame de saúde"
                                + ", é obrigatório para o serviço militar.");
                    } else {
                        if (idade <= 19) {
                            System.out.println("O candidato " + nome + " está ápto "
                                    + " para o serviço militar obrigatório.");
                        } else {
                            System.out.println("O candidato " + nome + " está ápto, "
                                    + " mas para o excesso de contingência!");
                        }
                    }
                }
            }
            System.out.println("");
            i++;
        }
*/
/* 22 - R:
        Scanner leitor = new Scanner(System.in);

        float precoVenda;
        float precoCusto;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        String nome;
        int i = 0;

        for (; i < 3; i++) {
            System.out.println("Digite o nome do produto");
            nome = leitor.next();

            System.out.println("Digite o preço de Custo");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de Venda");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Empate");
            } else {
                if (precoVenda > precoCusto) {
                    System.out.println("Lucro");
                } else {
                    System.out.println("Prejuizo");
                }
            }
        }
        System.out.println("A media de custo " + (totalCusto / i) + " R$");
        System.out.println("A media de venda " + (totalVenda / i) + " R$");
*/
/* 23 - R:
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = leitor.nextInt();

        if (n > 80) {
            System.out.println("O número " + n + " é maior que 80!");
        } else {
            if (n < 25) {
                System.out.println("O número " + n + " é menor que 25!");
            } else {
                if (n == 40) {
                    System.out.println("O número " + n + " é igual a 40!");
                }
            }
        }
        if (n < 80) {
            System.out.println("O número " + n + " é menor que 80!");
        } else {
            if (n == 80) {
                System.out.println("O número " + n + " é igual 80");
            }
        }
*/
/* 24 - R: 
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = leitor.nextInt();

        if (n > 0) {
            System.out.println(n + " = Número Positivo");
        } else {
            if (n == 0) {
                System.out.println("O número digitado é igual a zero!");
            } else {
                System.out.println(n + " = Número Negativo");
            }
        }
*/
/* 25 - R: 
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();

        if (a == b) {
            System.out.println("Os números digitados são iguais.");
        } else {
            if (a > b) {
                System.out.println("Os números digitados são diferentes.");
                System.out.println("O número " + a + " é maior que " + b + "!");
            } else {
                System.out.println("Os números digitados são diferentes.");
                System.out.println("O número " + b + " é maior que " + a + "!");
            }
        }
*/
/* 26 - R:        

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 - 5");
        int n = leitor.nextInt();

        switch (n) {

            case 1:
                System.out.println("Um");
                break;

            case 2:
                System.out.println("Dois");
                break;

            case 3:
                System.out.println("Três");
                break;

            case 4:
                System.out.println("Quatro");
                break;

            case 5:
                System.out.println("Cinco");
                break;

            default:
                System.out.println("número inválido");

        }
*/
/* 27 - R:
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do veículo");
        float valorVeiculo = leitor.nextFloat();

        float descontoAlcool = (valorVeiculo * 25) / 100;
        float descontoGas = (valorVeiculo * 21) / 100;
        float descontoDiesel = (valorVeiculo * 14) / 100;

        if (valorVeiculo == 0) {
            System.out.println("Programa encerrado!");
        } else {
            System.out.println("Escolha o tipo de combústivel");
            System.out.println("1 - Alcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            int opcao = leitor.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("O cliente irá pagar " + (valorVeiculo - descontoAlcool) + " R$");
                    break;

                case 2:
                    System.out.println("O cliente irá pagar " + (valorVeiculo - descontoGas) + " R$");
                    break;

                case 3:
                    System.out.println("O cliente irá pagar " + (valorVeiculo - descontoDiesel) + " R$");
                    break;

                default:
                    System.out.println("Opção inválida");
                    valorVeiculo = 0;
            }

        }
*/

/* 28 - R:
        Scanner leitor = new Scanner(System.in);

        float salarioMin = 1212.00f;
        float aumentoSalario;
        float reajuste = 0.0f;

        for (int i = 0; i < 584; i++) {
            System.out.println("Digite o primeiro nome do Funcionário");
            String nomeFuncionario = leitor.next();

            System.out.println("Digite o valor do Salário do Funcionário");
            float salarioFuncionario = leitor.nextFloat();

            float calcSalarioMin = (salarioFuncionario / salarioMin);

            if (calcSalarioMin <= 3) {
                System.out.println(nomeFuncionario + " irá receber 50% de aumento");
                reajuste = (salarioFuncionario * 0.5f);
                aumentoSalario = salarioFuncionario + reajuste;
            } else {
                if (calcSalarioMin >= 3 & calcSalarioMin <= 10) {
                    System.out.println(nomeFuncionario + " irá receber 20% de aumento");
                    reajuste = (salarioFuncionario * 0.2f);
                    aumentoSalario = salarioFuncionario + reajuste;
                } else {
                    if (calcSalarioMin > 10 & calcSalarioMin <= 20) {
                        System.out.println(nomeFuncionario + " irá receber 15% de aumento");
                        reajuste = (salarioFuncionario * 0.15f);
                        aumentoSalario = salarioFuncionario + reajuste;
                    } else {
                        System.out.println(nomeFuncionario + " irá receber 10% de aumento");
                        reajuste = (salarioFuncionario * 0.10f);
                        aumentoSalario = salarioFuncionario + reajuste;
                    }
                }
            }
            System.out.println("Será acrescido R$ " + reajuste + " em sua folha de pagamento");
            System.out.println("Novo salario de " + nomeFuncionario + " " + (salarioFuncionario + reajuste) + " R$");
        }

*/
/* 29 - R:
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número do mês");

        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido!");
        }
*/
/* 30 - R: 
        int[] numero = new int[3];
        System.out.println("Insira o primeiro número");
        numero[0] = entrada.nextInt();
        System.out.println("Insira o segundo número");
        numero[1] = entrada.nextInt();
        System.out.println("Insira o terceiro número");
        numero[2] = entrada.nextInt();
        for (int i = 0; i < numero.length - 1; i++) {
            for (int j = 0; j < numero.length - 1; j++) {
                if (numero[j] > numero[j + 1]) {
                    int aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;
                }
            }
        }
        System.out.println("A ordem crescente dos numeros é " + numero[0] + ", "
                + numero[1] + " e " + numero[2]);
*/
/* 31 - R: 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número da operação");
        Double A = entrada.nextDouble();
        System.out.println("Digite o segundo número da opreração");
        Double B = entrada.nextDouble();
        System.out.println("Digite o simbolo da operação que deseja realizar");
        System.out.println("+ soma | - subtração | * multiplicação | / divisão");
        char C = entrada.next().charAt(0);

        switch (C) {
            case '+':
                System.out.println("Operação de soma");
                System.out.println((A + B));
                break;
            case '-':
                System.out.println("Operação de subtração");
                System.out.println((A - B));
                break;
            case '*':
                System.out.println("Operação de multiplicação");
                System.out.println((A * B));
                break;
            case '/':
                if (A == 0 || B == 0) {
                    System.out.println("erro de divisão por zero");
                } else {
                    System.out.println("Operação de divisão");
                    System.out.println((A / B));
                }
                break;
            default:
                System.out.println("Simbolo inválido - operador não definido");
        }
*/
/* 32 - R: 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a medida do primeiro lado");
        int l1 = entrada.nextInt();
        System.out.println("Digite a medida do segundo lado");
        int l2 = entrada.nextInt();
        System.out.println("Digite a medida do terceiro lado");
        int l3 = entrada.nextInt();

        if (l1 + l2 < l3 || l2 + l3 < l1 || l1 + l3 < l2) {
            System.out.println("Não é um triângulo");
        } else {
            if (l1 == l2 & l2 == l3) {
                System.out.println("Triângulo equilátero");
            } else {
                if (l1 == l2 || l2 == l3 || l3 == l1) {
                    System.out.println("Triângulo isósceles");
                } else {
                    System.out.println("Triângulo escaleno");
                }
            }

        }
*/
/* 33 - R:

        Scanner entrada = new Scanner(System.in);

        float salarioProf = 0.0f;

        System.out.println("Digite o nível do Professor (1, 2 ou 3)");
        int nivelProf = entrada.nextInt();

        System.out.println("Digite quantas horas o profº trabalhou.");
        float qtdHoras = entrada.nextFloat();

        switch (nivelProf) {
            case 1:
                salarioProf = qtdHoras * 12;
                break;
            case 2:
                salarioProf = qtdHoras * 17;
                break;
            case 3:
                salarioProf = qtdHoras * 25;
                break;
            default:
                System.out.println("Nível inválido");
        }
        System.out.println("O salário deste profº é : " + salarioProf + " R$");
*/
/* 34 - R: 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade do Nadador :");
        int idade = entrada.nextInt();

        if (idade <= 10 && idade >= 5) {
            if (idade <= 7) {
                System.out.println("Infantil A");
            } else {
                System.out.println("Infantil B");
            }
        }

        if (idade <= 17 && idade >= 11) {
            if (idade <= 13) {
                System.out.println("Juvenil A");
            } else {
                System.out.println("Juvenil B");
            }
        } else {
            if (idade <= 25 && idade >= 18) {
                System.out.println("Sênior");
            }

        }
*/
/* 35 - R: 





