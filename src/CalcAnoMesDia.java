public class CalcAnoMesDia {
    int anos;
    int meses;
    int dias;

    CalcAnoMesDia(int anos, int meses, int dias){
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;

        anos = (anos * 365);
        meses = (meses * 30);

        System.out.println(anos + meses + dias + " dias de existência");
        System.out.println();

    }

}
