package brokerageDSL;

public class OrderClient {
	// This is the DSL here
	Order order = new Order.Builder().buy(100, "IBM").atLimitPrice(300)
			.allOrNone().valueAs(new StandardOrderValuer()).build();
}
