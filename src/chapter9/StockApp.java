package chapter9;

public class StockApp {

	public static void main(String[] args) {
		Stock stk = new Stock("ORCL", "Oracle Corporation");
		stk.setPreviousClosingPrice(90);
		stk.setCurrentClosingPrice(100);
		stk.getChangePercentage();
		stk.show();

	}

}

class Stock {
	private String symbol, name;
	private double previousClosingPrice;
	private double currentClosingPrice;

	Stock(String symbol, String name) {
		this.setSymbol(symbol);
		this.setName(name);
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentClosingPrice() {
		return currentClosingPrice;
	}

	public void setCurrentClosingPrice(double currentClosingPrice) {
		this.currentClosingPrice = currentClosingPrice;
	}

	public double getChangePercentage() {
		return (currentClosingPrice - previousClosingPrice) / previousClosingPrice;
	}

	public void show() {
		// NumberFormat nF = NumberFormat.getPercentInstance();
		String message;
		message = "Symbol:" + getSymbol() + '\n' + "Name:" + getName() + '\n' + "Change Percentage:"
				+ getChangePercentage() * 100 + " %";
		System.out.println(message);
	}

	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setName(String name) {
		this.name = name;
	}

}
