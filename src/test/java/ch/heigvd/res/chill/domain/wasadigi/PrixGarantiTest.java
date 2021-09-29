package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrixGarantiTest {

  @Test
  void thePriceAndNameForPrixGarantiShouldBeCorrect() {
    PrixGaranti beer = new PrixGaranti();
    assertEquals(beer.getName(), PrixGaranti.NAME);
    assertEquals(beer.getPrice(), PrixGaranti.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPrixGaranti() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wasadigi.PrixGaranti";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PrixGaranti.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}