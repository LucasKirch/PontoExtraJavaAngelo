import java.text.DecimalFormat;

public class SalarioMin {

    //5. Crie um algoritmo que receba via construtor o valor do salário mínimo
    // e o valor do salário de um usuário, calcule a quantidade de salários
    // mínimos esse usuário ganha e imprima o resultado.
    //(1SM=R$1320,00)
    double salarioMin = 1320.00;
    double salario;
    SalarioMin(double salario){
        this.salario = salario;

        double qtdSalarioMin = salario / this.salarioMin;

        DecimalFormat twoDForm = new DecimalFormat("#.00");

        System.out.println("Você recebe " +twoDForm.format(qtdSalarioMin)+ " vezes o salário mínimo." );
        System.out.println();

    }

}
