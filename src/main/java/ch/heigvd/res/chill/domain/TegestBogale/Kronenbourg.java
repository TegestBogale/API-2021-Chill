package ch.heigvd.res.chill.domain.TegestBogale;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kronenbourg implements IProduct {

  public final static String NAME = "PunkIPA";
  public final static BigDecimal PRICE = new BigDecimal(2.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
