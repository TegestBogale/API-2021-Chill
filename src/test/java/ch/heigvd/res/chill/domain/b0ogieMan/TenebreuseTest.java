package ch.heigvd.res.chill.domain.b0ogieMan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TenebreuseTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Tenebreuse beer = new Tenebreuse();
    assertEquals(beer.getName(), Tenebreuse.NAME);
    assertEquals(beer.getPrice(), Tenebreuse.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wasadigi.PunkIPA";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Tenebreuse.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}