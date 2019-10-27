package Command;

public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		Order buyStock = new BuyStock(abcStock);
		Order sellStock = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);

		broker.placeOrders();
	}
}
