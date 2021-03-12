package classe;

public class data {
    int dia, mes, ano;

    data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }
    String pegarDataInformada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    void imprimirData(){
        System.out.printf("%d/%d/%d", dia, mes, ano);
    }
}
