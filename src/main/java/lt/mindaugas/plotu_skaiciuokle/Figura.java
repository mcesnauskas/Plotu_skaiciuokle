package lt.mindaugas.plotu_skaiciuokle;

public class Figura {

    private double plotas;
    private double krastine1;
    private double krastine2;

    public double getPlotas() {
        return plotas;
    }

    public void setPlotas(double plotas) {
        this.plotas = plotas;
    }

    public Figura(double krastine1, double krastine2) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
    }

    public void skaiciuokPlota(){
        plotas = krastine1 * krastine2;
    }

    @Override
    public String toString() {
        return "Jusu figuros plotas yra: " + plotas + " kv.cm";
    }
}
