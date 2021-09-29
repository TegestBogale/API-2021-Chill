package ch.heigvd.res.chill.domain.AlenBijelic99;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Strongbow implements IProduct {

    public final static String NAME = "Strongbow";
    public final static BigDecimal PRICE = new BigDecimal(2.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
