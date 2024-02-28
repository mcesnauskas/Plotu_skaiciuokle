package lt.mindaugas.plotu_skaiciuokle;

public class Trikampis extends Figura{

    public Trikampis(double krastine1, double krastine2) {
        super(krastine1, krastine2);
        skaiciuokPlota();
    }

    @Override
    public void skaiciuokPlota() {
        double plotas = (getKrastine1() * getKrastine2()) / 2;
        super.setPlotas(plotas);
    }
}
