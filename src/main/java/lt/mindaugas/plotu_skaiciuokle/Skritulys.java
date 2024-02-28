package lt.mindaugas.plotu_skaiciuokle;

public class Skritulys extends Figura{

    public Skritulys(double krastine1) {
        super(krastine1, krastine1);
    }

    @Override
    public void skaiciuokPlota() {
        double plotas = ((getKrastine1() * getKrastine1()) * Math.PI);
        super.setPlotas(plotas);
    }
}
