import java.util.Scanner;

public class App {

    /*  Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
    Sabe-se que o cálculo da conta de luz segue a tabela abaixo: 
    
    Tipo de Cliente Valor do KW/h 
    a. (Residência) 0,60;
    b. (Comércio) 0,48;
    c. (Indústria) 1,29.
        
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float contaDeLuz = 0.0f;

        System.out.println("Informe o consumo total de Kh/h");
        int consumoEnergia = entrada.nextInt();

        System.out.println("Informe o tipo de cliente");
        System.out.println("R - Residência");
        System.out.println("C - Comércio");
        System.out.println("I - Industria");
        char tipoCliente = entrada.next().charAt(0);

        if (tipoCliente == 'C' || tipoCliente == 'c') {
            tipoCliente = 'C';
        }

        if (tipoCliente == 'R' || tipoCliente == 'r') {
            tipoCliente = 'R';
        }

        if (tipoCliente == 'I' || tipoCliente == 'i') {
            tipoCliente = 'I';
        }

        switch (tipoCliente) {
            case 'R' ->
                contaDeLuz = consumoEnergia * 0.60f;
            case 'C' ->
                contaDeLuz = consumoEnergia * 0.48f;
            case 'I' ->
                contaDeLuz = consumoEnergia * 1.29f;
            default ->
                System.out.println("Tipo inválido");
        }
        System.out.println("O valor da conta de Energia é : "
                + String.format("%.2f", contaDeLuz) + " R$");
    }

}
