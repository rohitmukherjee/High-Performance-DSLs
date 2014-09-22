package brokerageDSL;

public class Order {
	// Builder pattern used
	static class Builder {
		private String security;
		private int quantity;
		private int limitPrice;
		private boolean allOrNone;
		private int value;
		private String boughtOrSold;

		public Builder buy(int quantity, String security) {
			this.boughtOrSold = "Bought";
			this.quantity = quantity;
			this.security = security;
			return this;
		}

		public Builder sell(int quantity, String security) {
			this.boughtOrSold = "Sold";
			this.quantity = quantity;
			this.security = security;
			return this;
		}

		public Builder atLimitPrice(int price) {
			this.limitPrice = price;
			return this;
		}

		public Builder valueAs(OrderValuer ov) {
			this.value = ov.valueAs(quantity, limitPrice);
			return this;
		}

		public Builder allOrNone() {
			this.allOrNone = true;
			return this;
		}

		public Order build() {
			return new Order(this);
		}
	}

	private final String security;
	private final int quantity;
	private final int limitPrice;
	private final boolean allOrNone;
	private final String boughtOrSold;
	private int value;

	public Order(Builder b) {
		security = b.security;
		quantity = b.quantity;
		limitPrice = b.limitPrice;
		allOrNone = b.allOrNone;
		value = b.value;
		boughtOrSold = b.boughtOrSold;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getSecurity() {
		return security;
	}

	public boolean isAllOrNone() {
		return allOrNone;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getBoughtOrSold() {
		return boughtOrSold;
	}

	public int getLimitPrice() {
		return limitPrice;
	}
}
