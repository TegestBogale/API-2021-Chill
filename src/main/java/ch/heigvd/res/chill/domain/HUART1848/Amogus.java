package ch.heigvd.res.chill.domain.HUART1848;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Amogus implements IProduct {

  public final static String NAME = "Amogus";
  public final static BigDecimal PRICE = new BigDecimal(19.90);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
