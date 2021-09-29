package ch.heigvd.res.chill.domain.MehSalhi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PecheresseTest {

  @Test
  void thePriceAndNameForPecheresseShouldBeCorrect() {
    Pecheresse beer = new Pecheresse();
    assertEquals(beer.getName(), Pecheresse.NAME);
    assertEquals(beer.getPrice(), Pecheresse.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPecheresse() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MehSalhi.Pecheresse";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pecheresse.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}