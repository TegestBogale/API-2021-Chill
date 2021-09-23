package ch.heigvd.res.chill.domain.b0ogieMan;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Tenebreuse implements IProduct {

  public final static String NAME = "Tenebreuse";
  public final static BigDecimal PRICE = new BigDecimal(4.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
