public class Main {


    public static void Imprime(){
        int n1 = 8;
        int n2 = 9;
        int n3 = 7;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;

        double media1 = (n1 + n2 + n3)/3;

        double media2 = ((n4 + n5 + n6)/3);

        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media1 + media2);
        System.out.println((media1 + media2)/2);
        System.out.println();
    }

    public static void main(String[] args) {

        //1. Faça um algoritmo que receba via constutor a idade de uma pessoa expressa em anos,
        // meses e dias e mostre-a expressa em dias.
        //Obs.: Leve em consideração o ano com 365 dias e o mês com 30
        //(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
        CalcAnoMesDia cal = new CalcAnoMesDia(10,3,12);

        //2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
        // A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
        Imprime();

        //3. Informar um saldo e imprimir o saldo com reajuste de 1%.
        Saldo saldo = new Saldo(547.52);

        //4. Escrever um algoritmo que receba via construtor:
        //- a porcentagem do IPI a ser acrescido no valor das peças
        //- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        //- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        //O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
        //Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
        AlgoritimoCalc calc = new AlgoritimoCalc(5,1,45.23,3,2,32.50,4);

        //5. Crie um algoritmo que receba via construtor o valor do salário mínimo
        // e o valor do salário de um usuário, calcule a quantidade de salários
        // mínimos esse usuário ganha e imprima o resultado.
        //(1SM=R$1320,00)
        SalarioMin salarioMin = new SalarioMin(2000);

        //6. Desenvolva um algoritmo em Java que receba via construtor um número inteiro e imprima o seu antecessor e seu sucessor.
        ImpAnteSuce imp = new ImpAnteSuce(10);

    }




}