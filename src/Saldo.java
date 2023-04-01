public class Saldo {
    double saldo;
    Saldo(double saldo){
        this.saldo = saldo;

        this.saldo = this.saldo + (this.saldo * 0.01) ;
        System.out.println(this.saldo + " Esse é seu saldo com reajuste de 1%.");
        System.out.println();
    }

}
