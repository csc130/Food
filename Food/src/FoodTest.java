import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;


public class FoodTest {
	Food aFood = new Food("Onion Rings", "Fried onions", new BigDecimal(3.50));
	@Test
	public void test() {
		System.out.println(aFood);
		System.out.println(aFood.toString());
		
	}

}
