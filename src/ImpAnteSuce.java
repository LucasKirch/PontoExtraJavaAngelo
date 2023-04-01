public class ImpAnteSuce {

    int numero;

    ImpAnteSuce(int numero){
        this.numero = numero;

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O número antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor);
        System.out.println();
    }

}
