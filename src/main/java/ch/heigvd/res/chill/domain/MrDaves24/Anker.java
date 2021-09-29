package ch.heigvd.res.chill.domain.MrDaves24;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Anker implements IProduct {

  public final static String NAME = "Anker";
  public final static BigDecimal PRICE = new BigDecimal("0.8");

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
