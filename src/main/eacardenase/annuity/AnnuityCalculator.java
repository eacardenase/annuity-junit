package eacardenase.annuity;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class AnnuityCalculator {
    public String calculateAnnuity(String R, int t, String r, int n) {

        BigDecimal a = new BigDecimal(r).divide(new BigDecimal(n));
        BigDecimal b = BigDecimal.ONE.add(a);
        BigDecimal c = b.pow(n * t);
        BigDecimal d = c.subtract(BigDecimal.ONE);
        BigDecimal e = d.divide(a);
        BigDecimal f = e.multiply(new BigDecimal(R));

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return formatter.format(f);
    }
}
