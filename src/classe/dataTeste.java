package classe;

public class dataTeste {
    public static void main(String[] args) {
        data setData = new data();
        setData.dia = 19;
        setData.mes = "Janeiro";
        setData.ano = 1996;

        System.out.println("A data foi registrada " + setData.ano);
    }
}
