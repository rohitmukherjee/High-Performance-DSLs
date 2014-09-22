package brokerageDSL;

public interface OrderValuer {

	public int valueAs(int quantity, int unitPrice);
}
