package classe;

import java.util.Scanner;

public class dataTeste {
    public static void main(String[] args) {

        data setData = new data(19, 01, 1996);
        data setData1 = new data();

        System.out.println("A data informada foi: " + setData.pegarDataInformada());
        System.out.println("A data informada foi: " + setData1.pegarDataInformada());
    }
}
