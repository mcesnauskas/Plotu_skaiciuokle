package lt.mindaugas.plotu_skaiciuokle;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        IOManager ioManager = new IOManager();
        ioManager.suzinokFigura();
        ioManager.suzinokKrastines();

        if (ioManager.getPasirinktaFigura() == 1){
            Kvadratas kvadratas = new Kvadratas(ioManager.getKrastine1());
            kvadratas.skaiciuokPlota();
            ioManager.spausdinkPlota(kvadratas.toString());
        } else if (ioManager.getPasirinktaFigura() == 2) {
            Trikampis trikampis = new Trikampis(ioManager.getKrastine1(), ioManager.getKrastine2());
            trikampis.skaiciuokPlota();
            ioManager.spausdinkPlota(trikampis.toString());
        } else if (ioManager.getPasirinktaFigura() == 3){
            Statciakampis statciakampis = new Statciakampis(ioManager.getKrastine1(), ioManager.getKrastine2());
            statciakampis.skaiciuokPlota();
            ioManager.spausdinkPlota(statciakampis.toString());
        } else {
            ioManager.spausdinkPlota("");
        }

    }
}
