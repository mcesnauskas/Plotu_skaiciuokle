package lt.mindaugas.plotu_skaiciuokle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skritulys extends Figura{

    public Skritulys(double krastine1) {
        super(krastine1, krastine1);
    }

    @Override
    public void skaiciuokPlota() {
        double plotas = ((getKrastine1() * getKrastine1()) * Math.PI);
        super.setPlotas(plotas);
        BigDecimal suapvalintasPlotas = BigDecimal.valueOf(plotas).setScale(2, RoundingMode.UP);
        super.setPlotas(suapvalintasPlotas.doubleValue());
    }
}
