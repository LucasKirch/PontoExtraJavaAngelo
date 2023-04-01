import java.text.DecimalFormat;

public class AlgoritimoCalc {

    double IPI;
    double idPeca1;
    double vlPeca1;
    double qtdPeca1;
    double idPeca2;
    double vlPeca2;
    double qtdPeca2;

    AlgoritimoCalc(double IPI, int idPeca1, double vlPeca1, double qtdPeca1, double idPeca2, double vlPeca2, double qtdPeca2){

        this.IPI = IPI;
        this.idPeca1 = idPeca1;
        this.vlPeca1 = vlPeca1;
        this.qtdPeca1 = qtdPeca1;
        this.idPeca2 = idPeca2;
        this.vlPeca2 = vlPeca2;
        this.qtdPeca2 = qtdPeca2;

        double soma = (vlPeca1 * qtdPeca1 + vlPeca2 * qtdPeca2)*(IPI/100 + 1);
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        System.out.println(twoDForm.format(soma));
        System.out.println();
    }

}
