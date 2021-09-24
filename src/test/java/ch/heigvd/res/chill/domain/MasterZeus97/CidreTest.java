package ch.heigvd.res.chill.domain.MasterZeus97;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Duvel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CidreTest {

  @Test
  void thePriceAndNameForCidreShouldBeCorrect() {
    Cidre beer = new Cidre();
    assertEquals(beer.getName(), Cidre.NAME);
    assertEquals(beer.getPrice(), Cidre.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCidre() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MasterZeus97.Cidre";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Cidre.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}