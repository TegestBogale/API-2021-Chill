package ch.heigvd.res.chill.domain.MasterZeus97;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Cidre implements IProduct {

  public final static String NAME = "Cidre";
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
