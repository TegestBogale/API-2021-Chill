package ch.heigvd.res.chill.domain.vogelma;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinalcoTest {

  @Test
  void thePriceAndNameForSinalcoShouldBeCorrect() {
    Sinalco brew = new Sinalco();
    assertEquals(brew.getName(), Sinalco.NAME);
    assertEquals(brew.getPrice(), Sinalco.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSinalco() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.vogelma.Sinalco";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Sinalco.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}